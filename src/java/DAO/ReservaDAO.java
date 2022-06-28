
package DAO;
import Modelo.Reserva;
import config.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ReservaDAO implements DAO <Reserva>{
       Conexion cn = new Conexion();
       Connection con;
       PreparedStatement ps;
       ResultSet rs;
       CallableStatement called;
       

    @Override
    public boolean agregar(Reserva obj) {
                boolean val=false;
                 try {
                con =cn.Conexion();
                called=con.prepareCall("{ CALL insertar_reserva ( ?,?,?,?,?,?) }");
                called.setString(1,obj.getId_reserva());
                called.setString(2,obj.getFecha_reservacion());
                called.setString(3,obj.getEstado());
                called.setString(4,obj.getId_habitacion());
                called.setString(5,obj.getId_cliente());
                called.setString(6,obj.getEstadia());
                       if(called.executeUpdate()>0){
                           val=true;
             }
                       
             } catch (SQLException e) {

        }
    return val;

    }

    @Override
    public boolean actualizar(Reserva obj) {
        boolean val=false;

            String sgl="update reserva set fecha_reservacion=? ,id_habitacion=?  where id_reserva=?";
           try{
               con = cn.Conexion();
               ps=con.prepareStatement(sgl);
               ps.setString(1, obj.getFecha_reservacion());
               ps.setString(2, obj.getId_habitacion());
               ps.setString(3, obj.getId_reserva());
                   if(ps.executeUpdate()>0){
                        val=true;
        }
           }catch(SQLException w){
           }
        return val;
    }

    @Override
    public boolean eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object datos() {
           return null;
    }
    
    public Reserva get_reserva(String  id){
          Reserva res=new Reserva();
          String sql ="select *from reserva  where id_reserva='"+id+"'";
        try{
                con =cn.Conexion();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                    res.setId_reserva(rs.getString(1));
                    res.setFecha_reservacion(rs.getString(2));
                    res.setEstado(rs.getString(3));
                    res.setId_habitacion(rs.getString(4));
                    res.setId_cliente(rs.getString(5));
                    res.setEstadia(rs.getString(6));  
                }
        }catch(SQLException e){
            
        }
          return res;
    }

    @Override
    public List Listar() {
            String sql ="select *from reserva";
            List<Reserva> lista = new ArrayList<>();
            try{
                con =cn.Conexion();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                    Reserva re=new Reserva();
                    re.setId_reserva(rs.getString(1));
                    re.setFecha_reservacion(rs.getString(2));
                    re.setEstado(rs.getString(3));
                    re.setId_habitacion(rs.getString(4));
                    re.setId_cliente(rs.getString(5));
                    re.setEstadia(rs.getString(6));  
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
