
package Semana3;

/**
 * Diego Iván Oliveros Acosta
 * @scalapp.co ITOS 29/06/2022
 */
public class Animal {
    String nombre;  //atributo de la clase Animal
    public void realizarsonido(int veces){   //método de la clase Animal
        System.out.println("Grrrr");
    }  
}
class Gato extends Animal{
   @Override
   public void realizarsonido(int veces){
       System.out.println("Meow"); 
  }
}

class Perro extends Animal{
   @Override
   public void realizarsonido(int veces){
       for (int i=0; i<veces;i++){
       System.out.println("Woof");} 
  }
   public void realizarsonido(){
       
       System.out.println("Woof");
  }
}
