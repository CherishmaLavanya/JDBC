package Lavanya_jdbc_program1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Statement;

public class Lavanya_jdbc_program3 {
 static Connection con=null;
 static Statement state =null;
 static ResultSet res=null;
 int dep_id;
 String dep_name;
 void display()
 {
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");  
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_mgmt","root","root");
		 System.out.println("connected ");
		 state = (Statement) con.createStatement();
	 }
	 catch(Exception e)
	 {
		 System.out.println(e.getMessage());
	 }
	 
 }
 void insert()
 {
	PreparedStatement ps = null;
	try {
		String s = "insert into department values(?,?)";
		ps = con.prepareStatement(s);
		ps.setInt(1, 7);
		ps.setNString(2, "Hr");
		ps.execute();
		 System.out.println("inserted");

	} catch(SQLException e)
	{
		e.printStackTrace();
	}
 }
 void update()
 {
	 PreparedStatement ps = null;
	 try {
		 String s = "update department set dep_name=? where dep_id=?";
		 ps=con.prepareStatement(s);
		 ps.setString(3,"Testing");
	     ps.setInt(2,1);
		 ps.execute();
	 } catch (SQLException e)
	 {
			e.printStackTrace();

	 }
 }

	public static void main(String[] args) {
		Lavanya_jdbc_program3 o = new Lavanya_jdbc_program3();
		o.display();
		o.insert();
		o.update();
		try {
			if(con!=null)
			con.close();
			if(state!=null)
				((Connection) state).close();
			if(res!=null)
				((Connection) state).close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	

}
