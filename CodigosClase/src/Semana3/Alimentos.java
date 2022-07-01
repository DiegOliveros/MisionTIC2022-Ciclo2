package Semana3;

/**
 * Diego Iván Oliveros Acosta
 *
 * @scalapp.co ITOS 1/07/2022
 */
public class Alimentos {

     String nombre;
     int precio;

    Alimentos(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
