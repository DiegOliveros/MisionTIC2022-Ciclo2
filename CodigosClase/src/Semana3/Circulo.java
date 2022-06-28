
package Semana3;

/**
 * Diego Iván Oliveros Acosta
 * @scalapp.co ITOS 28/06/2022
 */
public class Circulo extends Figura2 implements Elemento{
        float radio;
   
    Circulo (float radio){
        this.radio=radio;
    }
    @Override
    public float area() {
        return (float) (Math.PI*radio*radio);
    }
    @Override
    public String color () {
        return "";
    }
}
