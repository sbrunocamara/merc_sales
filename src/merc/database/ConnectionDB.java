/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bsbru
 */
public class ConnectionDB {
    
    public Connection getConnection(){
        
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            
            e.printStackTrace();
            
        }
        
        try{
            
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/merc_database?useSSL=false","root","698523");
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return conn;
    }
    
}
