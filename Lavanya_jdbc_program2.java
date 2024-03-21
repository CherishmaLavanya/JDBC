package Lavanya_jdbc_program1;
import java.sql.*;

public class Lavanya_jdbc_program2 {
	static Connection con;
	static ResultSet rs;
	public static ResultSet method(String s1) {
		try {
		Statement stmt=con.createStatement(); 
		 rs=stmt.executeQuery(s1);
		 while(rs.next())
			{
				System.out.println(rs.getInt("id")+"  "+rs.getString("name")+"  "+rs.getInt("salary"));   
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return rs;
			}
public static void main(String args[]){  
try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_mgmt","root","root");
	System.out.println("connected to the Database");
	String s="select * from employee";
	rs=method(s);
	
	}
catch(Exception e){ 
	e.printStackTrace();
	}  
}
}
		
