
package Modelo;



public class Usuario {
    
    
    private String id_usuario;
    private String usuario ;
    private String contrasena;
    private String id_empleado ;  
    private int seguridad;

    public Usuario() {
    }

    public Usuario(String id_usuario, String usuario, String contrasena, String id_empleado, int seguridad) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.id_empleado = id_empleado;
        this.seguridad = seguridad;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(int seguridad) {
        this.seguridad = seguridad;
    }
    
    
   
}
