
package Semana3;

/**
 * Diego Iván Oliveros Acosta
 * @scalapp.co ITOS 28/06/2022
 */
public class Circulo extends Figura implements Elemento{
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

    @Override
    public float divujar(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
