/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Habitacion;
import Modelo.Reserva;
import config.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author smith
 */
public class HabitacionDAO implements DAO <Habitacion>{
       Conexion cn = new Conexion();
       Connection con;
       PreparedStatement ps;
       ResultSet rs;
       CallableStatement call;
       
    @Override
    public boolean agregar(Habitacion obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(Habitacion obj) {
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
      String sql ="select *from habitacion";
            List<Habitacion> lista = new ArrayList<>();
            try{
               con =cn.Conexion();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                   Habitacion re=new Habitacion();
                   re.setId_habitacion(rs.getString(1));
                   re.setDisponibilidad(rs.getInt(2));
                   re.setCantidad_camas(rs.getInt(3));
                   re.setCapacidad(rs.getInt(4));
                   re.setId_categoria(rs.getString(5));
                   re.setId_hotel(rs.getString(6));
                   re.setNumero(rs.getInt(7));
                   
                     lista.add(re);
                }
                
            }catch(SQLException e){
                
            }
         return lista;




    }

    public Habitacion get_resbucasrHabitacion(String  id){

          
           Habitacion re=new Habitacion();
          try{
                con =cn.Conexion();
                call=con.prepareCall("{CALL lista_habitacion()}");

                rs=call.executeQuery();
                while(rs.next()){
                   re.setId_habitacion(rs.getString(1));
                   re.setDisponibilidad(rs.getInt(2));
                   re.setCantidad_camas(rs.getInt(3));
                   re.setCapacidad(rs.getInt(4));
                   re.setId_categoria(rs.getString(5));
                   re.setNumero(rs.getInt(6));
                }
        }catch(SQLException e){
            
        }
          return re;
    }
      

    public List ListarHabitacion(String id) {
      String sql ="SELECT * FROM habitacion h inner join categoria_habitacion ct on"
              + " ct.id_categoria=h.id_categoria WHERE ct.nombre='"+id+"'";
            List<Habitacion> lista = new ArrayList<>();
            try{
                con =cn.Conexion();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                    Habitacion re=new Habitacion();
                   re.setId_habitacion(rs.getString(1));
                   re.setDisponibilidad(rs.getInt(2));
                   re.setCantidad_camas(rs.getInt(3));
                   re.setCapacidad(rs.getInt(4));
                   re.setId_categoria(rs.getString(5));
                   re.setId_hotel(rs.getString(6));
                   re.setNumero(rs.getInt(7));

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
