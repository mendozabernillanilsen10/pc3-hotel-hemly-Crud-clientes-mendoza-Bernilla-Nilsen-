/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    Connection con;
    String url = "jdbc:mysql://localhost:3306/bdemely";
    String user ="root";
    String pass ="";
    
    public Connection Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url,user,pass);
        }catch(ClassNotFoundException | SQLException e){
            
        }
        return con;
    }
    
 
}
