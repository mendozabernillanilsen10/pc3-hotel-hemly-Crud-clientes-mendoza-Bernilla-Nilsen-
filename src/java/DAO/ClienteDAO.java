/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Habitacion;
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
public class ClienteDAO implements DAO <Cliente> {
       Conexion cn = new Conexion();
       Connection con;
       PreparedStatement ps;
       ResultSet rs;
       CallableStatement call;

    @Override
    public boolean agregar(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(Cliente obj) {
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
                   List<Cliente> lista = new ArrayList<>();

          try{
                con =cn.Conexion();
                call=con.prepareCall("{CALL lista_cliente()}");
                rs=call.executeQuery();
                while(rs.next()){
                  Cliente re=new Cliente();
                   re.setId_cliente(rs.getString(1));
                   re.setId_documento(rs.getString(2));
                   re.setNombre(rs.getString(3));
                   re.setApellido(rs.getString(4));
                   re.setId_genero(rs.getString(5));
                   re.setId_direccion(rs.getString(6)+"- "+  rs.getString(10)+" - "+rs.getString(11));  
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
