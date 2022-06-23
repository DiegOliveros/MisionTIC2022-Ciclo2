package semana2;

/**
 * 23 junio 2022
 * @author Diego Iván Oliveros Acosta @author ITOS
 */
public class Figura {

    private float area;
    private float perimetro;
    private String nombre;

    int mostrar_Dimension() {
        int Dimension = 1;
        return Dimension;
    }

    /**
     * @return the area
     */
    public float getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * @return the perimetro
     */
    public float getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
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
    
}

class Triangulo extends Figura{
    
}
class Run {
    public static void main(String[] args) {
        Triangulo trian = new Triangulo();
        trian.setArea(25);
        System.out.println(trian.getArea());
    }
}
