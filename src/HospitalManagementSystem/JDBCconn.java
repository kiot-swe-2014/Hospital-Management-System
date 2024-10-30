/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Software Engineers
 */
public class JDBCconn {
    
    public JDBCconn(){
        startConnection();
    
}
    
    public void startConnection(){
        String JDBC_URL = "jdbc:mysql://localhost:3306/studentinformation";
    String JDBC_USER = "root";
     String JDBC_PASSWORD = "";  // No password

        
    
        Connection connection = null;
       

        try {
            // Step 1: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Open a connection
            System.out.println("Connecting to the database...");
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Step 3: Execute a query
          
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Step 5: Clean-up the environment
            try {
                
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}
}
