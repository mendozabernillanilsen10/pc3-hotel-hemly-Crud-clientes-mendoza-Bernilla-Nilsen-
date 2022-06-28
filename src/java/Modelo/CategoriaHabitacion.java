
package Modelo;

public class CategoriaHabitacion {
    private String id_categoria;
    private String nombre;
    private double costo;

    public CategoriaHabitacion() {
    }

    public CategoriaHabitacion(String id_categoria, String nombre, double costo) {
        this.id_categoria = id_categoria;
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }


}
