
package Semana5;

/**
 * Diego Iván Oliveros Acosta
 * @scalapp.co ITOS 12/07/2022
 */
public class Calculadora {

    static void main(String[] args) {
        System.out.println("hola mundo desde main");
    }

   
    public double sumar(double a, double b){
        return a+b;
    }
     public double restar(double a, double b){
        return a-b;
    }
      public double multiplicar(double a, double b){
          double c=0;
          for (int i=0; i<b;i++){
          c=sumar(a,c);
          }
        return c;
    }
}
