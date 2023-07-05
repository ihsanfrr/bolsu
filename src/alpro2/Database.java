/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alpro2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ihsanfrr
 */
public class Database {
    public static Connection connect() {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String mysqlURL = "jdbc:mysql://localhost:8889/bolsu_db?zeroDateTimeBehavior=CONVERT_TO_NULL";
            
            // Catatan untuk windows default username="root" dan password=""
            conn = (Connection) DriverManager.getConnection(mysqlURL, "root", "root");
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println(e.toString());
        }
        
        return conn;
    }
}