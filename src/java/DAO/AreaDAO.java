
package DAO;

import Modelo.Area;
import Modelo.Cliente;
import config.Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class AreaDAO implements DAO <Area>{
      Conexion cn = new Conexion();
       Connection con;
       PreparedStatement ps;
       ResultSet rs;
       CallableStatement call;
     
 
    @Override
    public boolean agregar(Area obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(Area obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object datos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List Listar() {
                 List<Area> lista = new ArrayList<>();

          try{
                con =cn.Conexion();
                call=con.prepareCall("{CALL lista_area ()}");
                rs=call.executeQuery();
                while(rs.next()){
                  Area re=new Area();

                   re.setId_area(rs.getString(1));
                   re.setNombre(rs.getString(2));
                   re.setDescripcion(rs.getString(3));
                   
                   lista.add(re); 
                }
        }catch(SQLException e){
            
        }
          return lista;




    }

    @Override
    public Object buscar(String id, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
