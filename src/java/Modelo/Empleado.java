
package Modelo;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class Empleado extends Persona {
                private String id_empleado;
                private int estado;
                private byte[] foto;
  public  Empleado() {
        
    }
    public String getId_empleado() {
        return id_empleado;
    }
 

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    //insertar
    public Empleado(String id_empleado, int estado, byte[] foto,String id_persona, String nombre, String apellido, String fecha_nacimiento, String correo_electronico, String id_documento, String id_genero, String id_direccion) {
        super(id_persona, nombre, apellido, fecha_nacimiento, correo_electronico, id_documento, id_genero, id_direccion);
     this.id_empleado = id_empleado;
        this.estado = estado;
        this.foto = foto;
    }
   //actualizar
    public Empleado( int estado, byte[] foto,String id_persona, String nombre, String apellido, String fecha_nacimiento, String correo_electronico, String id_genero) {
        super(id_persona, nombre, apellido, fecha_nacimiento, correo_electronico, id_genero );
        this.estado = estado;
        this.foto = foto;
    }
    public Empleado(String id_persona, String nombre, String apellido, String fecha_nacimiento, String correo_electronico, String id_documento, String id_genero, String id_direccion) {
        super(id_persona, nombre, apellido, fecha_nacimiento, correo_electronico, id_documento, id_genero, id_direccion);
    }

    public Empleado(String nombre, String apellido, String fecha_nacimiento, String correo_electronico, String id_genero) {
        super(nombre, apellido, fecha_nacimiento, correo_electronico, id_genero);
    }

    public Empleado(String id_empleado, int estado, byte[] foto) {
        this.id_empleado = id_empleado;
        this.estado = estado;
        this.foto = foto;
    }
      


 }


