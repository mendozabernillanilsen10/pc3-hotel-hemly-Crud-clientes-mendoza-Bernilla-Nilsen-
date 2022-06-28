/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.CategoriaHabitacion;
import Modelo.Reserva;
import config.Conexion;
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
public class categoriaDAO implements DAO <CategoriaHabitacion>{
       Conexion cn = new Conexion();
       Connection con;
       PreparedStatement ps;
       ResultSet rs;
       
    @Override
    public boolean agregar(CategoriaHabitacion obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(CategoriaHabitacion obj) {
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
   String sql ="select *from categoria_habitacion";
            List<CategoriaHabitacion> lista = new ArrayList<>();
            try{
                con =cn.Conexion();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                    CategoriaHabitacion re=new CategoriaHabitacion();
                    re.setId_categoria(rs.getString(1));
                    re.setNombre(rs.getString(2));
                    re.setCosto(rs.getDouble(3));
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
