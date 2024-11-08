/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Software Engineers
 */
 class JDBCconn {
    
//    public JDBCconn(){
//        startConnection();
//    
//}
    
    public static Connection startConnection(){
        String JDBC_URL = "jdbc:mysql://localhost:3306/Hospital";
        String JDBC_USER = "root";
       String JDBC_PASSWORD = "";  // No password      
   
        try {
            // Step 1: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Open a connection
           
          Connection  connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            return connection; 
          
        } catch (Exception e) {
        return null;
    }
}
}
