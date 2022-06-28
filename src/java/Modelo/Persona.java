
package Modelo;


public class Persona {

    public Persona(String id_persona, String nombre, String apellido, String fecha_nacimiento, String correo_electronico, String id_documento, String id_genero, String id_direccion) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo_electronico = correo_electronico;
        this.id_documento = id_documento;
        this.id_genero = id_genero;
        this.id_direccion = id_direccion;
    }
    public Persona( String id_persona,String nombre, String apellido, String fecha_nacimiento, String correo_electronico,  String id_genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_persona = id_persona;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo_electronico = correo_electronico;
        this.id_genero = id_genero;

    }
    public Persona( String nombre, String apellido, String fecha_nacimiento, String correo_electronico,  String id_genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo_electronico = correo_electronico;
        this.id_genero = id_genero;

    }
    public Persona( String id_persona) {
        this.id_persona = id_persona;
    }

    public Persona( ) {
    }

            private String id_persona;
            private String nombre;
            private String apellido;
            private String fecha_nacimiento;
            private String correo_electronico;
            private String id_documento;
            private String id_genero;
            private String id_direccion;
  

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getId_documento() {
        return id_documento;
    }

    public void setId_documento(String id_documento) {
        this.id_documento = id_documento;
    }

    public String getId_genero() {
        return id_genero;
    }

    public void setId_genero(String id_genero) {
        this.id_genero = id_genero;
    }

    public String getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(String id_direccion) {
        this.id_direccion = id_direccion;
    }

  
    
}
