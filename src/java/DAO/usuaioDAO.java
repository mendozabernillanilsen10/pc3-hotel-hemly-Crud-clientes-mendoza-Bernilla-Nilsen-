package DAO;

import Modelo.Usuario;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class usuaioDAO {
   
   Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public Usuario validar(String User , String clave  ){
        Usuario use = new Usuario();
        
        String sql = "SELECT * FROM usuario WHERE usuario=? AND contrasena =PASSWORD(?)";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1,User);
            ps.setString(2,clave);
            rs=ps.executeQuery();
            
            while(rs.next()){
               
                use.setId_usuario("id_usuario");
                use.setId_empleado("id_empleado");
            }
        }catch(SQLException e ){
            
        }
        return use; 
    }
    
}