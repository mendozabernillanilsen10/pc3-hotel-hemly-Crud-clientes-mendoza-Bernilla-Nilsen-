
package Modelo;

public class Reserva {
    private String id_reserva;
    private String fecha_reservacion;
    private String estado;
    private String id_habitacion;
    private String id_cliente;
    private String estadia;
  public Reserva() {

    }
    public Reserva(String id_reserva, String fecha_reservacion, String estado, String id_habitacion, String id_cliente, String estadia) {
        this.id_reserva = id_reserva;
        this.fecha_reservacion = fecha_reservacion;
        this.estado = estado;
        this.id_habitacion = id_habitacion;
        this.id_cliente = id_cliente;
        this.estadia = estadia;
    }

    public String getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(String id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getFecha_reservacion() {
        return fecha_reservacion;
    }

    public void setFecha_reservacion(String fecha_reservacion) {
        this.fecha_reservacion = fecha_reservacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(String id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getEstadia() {
        return estadia;
    }

    public void setEstadia(String estadia) {
        this.estadia = estadia;
    }

  
    
}
