package Lavanya_jdbc_program1;

import java.sql.*;

public class JdbcConnection {
    static Connection con = null;
    static Statement state = null;
    static ResultSet rs = null;

    public void connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_mgmt", "root", "root");
            System.out.println("Connected to database");
        } 
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public void createRecord(String insertquery) 
    {
        try {
        	state = con.createStatement();
        	state.executeUpdate(insertquery);

            System.out.println("Record inserted successfully");
        } 
        catch (SQLException e) 
        {
            System.out.println(e);
        }
    }
    
    public void readRecord(String selectquery) 
    {
        try {
            state = con.createStatement();
            rs = state.executeQuery(selectquery);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int depid = rs.getInt("depid");
                System.out.println("ID: " + id + ", Name: " + name + ", DepID: " + depid);
            }
        } 
        catch (SQLException e) 
        {
            System.out.println(e);
        }
    }
    public void deleteRecord(String deletequery) 
    {
        try {
            state = con.createStatement();
            state.executeUpdate(deletequery);
            System.out.println("Record deleted successfully");
        } 
        catch (SQLException e) 
        {
            System.out.println(e);
        }
    }
    
    public void updateRecord(String updatequery) {
        try {
            state = con.createStatement();
            state.executeUpdate(updatequery);
            System.out.println("Record updated successfully");
        } 
        catch (SQLException e) 
        {
            System.out.println(e);
        }
    }

    public void closeConnection()
    {
        try {
            if (con != null) {
                con.close();
                System.out.println("Database connection closed");
            }
        } 
        catch (SQLException e) 
        {
            System.out.println(e);
        }
    }
}