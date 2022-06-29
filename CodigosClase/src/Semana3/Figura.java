package Semana3;

/**
 * Diego Iván Oliveros Acosta
 *
 * @scalapp.co ITOS 28/06/2022
 */
public abstract class Figura {

    private String color;   //atributos de clase

    public abstract float area();  //método abstracto 

    public abstract float divujar(int x, int y);//método abstracto 

    public int perimetro(int p) {

        return p;
    }

    /**
     * @return the color
     */
    public String getColor() {  //método tradicional
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

}
