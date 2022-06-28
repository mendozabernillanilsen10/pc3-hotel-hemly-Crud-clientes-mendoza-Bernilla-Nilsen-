
package DAO;

import java.util.List;

public interface DAO  <P>{

    boolean agregar(P obj);
    boolean actualizar(P obj);
    boolean eliminar(String id);
    Object datos();
    List Listar();
    
    Object buscar(String id,String nombre);
}
