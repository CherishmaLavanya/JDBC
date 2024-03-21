package Lavanya_jdbc_program1;
import java.sql.*;
public class SqlConnection {

	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/employee_mgmt","root","root");  
		System.out.println("connected");
		con.close();  
		}catch(Exception e)
		{  
			System.out.println(e);
			}  
		}  
		}  