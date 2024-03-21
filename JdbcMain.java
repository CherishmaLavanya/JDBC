package Lavanya_jdbc_program1;

import java.sql.*;

public class JdbcMain {

    public static void main(String[] args) {
        JdbcConnection jdbcConnection = new JdbcConnection();
        jdbcConnection.connection();
        
        
//        String insertquery = "INSERT INTO employee1 (name, depid) VALUES ('rama', 4)";
//        jdbcConnection.createRecord(insertquery);   
//        
        String selectQuery = "SELECT * FROM employee1";
        jdbcConnection.readRecord(selectQuery);
        
//        String updateQuery = "UPDATE employee1 SET name = 'krishna' WHERE id = 10";
//        jdbcConnection.updateRecord(updateQuery);
        
        

        String deleteQuery = "DELETE FROM employee1 WHERE id = 7";
        jdbcConnection.deleteRecord(deleteQuery);

            jdbcConnection.closeConnection();
    }
}
