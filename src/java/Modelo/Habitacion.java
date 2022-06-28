
package Modelo;


public class Habitacion {

    public Habitacion() {
    }

    public String getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(String id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getCantidad_camas() {
        return cantidad_camas;
    }

    public void setCantidad_camas(int cantidad_camas) {
        this.cantidad_camas = cantidad_camas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getId_hotel() {
        return id_hotel;
    }

    public void setId_hotel(String id_hotel) {
        this.id_hotel = id_hotel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    

    public Habitacion(String id_habitacion, int disponibilidad, int cantidad_camas, int capacidad, String id_categoria, String id_hotel, int numero, byte[] foto) {
        this.id_habitacion = id_habitacion;
        this.disponibilidad = disponibilidad;
        this.cantidad_camas = cantidad_camas;
        this.capacidad = capacidad;
        this.id_categoria = id_categoria;
        this.id_hotel = id_hotel;
        this.numero = numero;
        this.foto = foto;
    }
    private String id_habitacion;
    private int disponibilidad;
    private int cantidad_camas;
    private int capacidad;
    private String id_categoria;
    private String id_hotel;
    private int  numero;
    private byte[] foto;

}

