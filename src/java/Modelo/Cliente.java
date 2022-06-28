
package Modelo;


public class Cliente extends Persona {
    private String id_cliente;

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Cliente() {
    }

    //no existe
    public Cliente(
            String id_cliente,
            String id_persona, String nombre, String apellido, String fecha_nacimiento, String correo_electronico, String id_documento, String id_genero, String id_direccion
            ) {
        super(id_persona,  nombre,  apellido,  fecha_nacimiento,  correo_electronico,  id_documento,  id_genero,  id_direccion);
        this.id_cliente=id_cliente;
    }
        //el empleado quiere ser cliente
    public Cliente(String id_cliente,String id_persona) {
        super(id_persona);
        this.id_cliente=id_cliente;
    }
        // para actualizar datos de cliente
    public Cliente(String id_persona,
            String nombre, String apellido, String fecha_nacimiento, String correo_electronico,String id_genero) {
        super(id_persona, nombre,  apellido,  fecha_nacimiento,  correo_electronico,  id_genero);
        
    }

    



}