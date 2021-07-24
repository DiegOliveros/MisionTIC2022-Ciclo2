/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerClassCiclo2;

/**
 *
 * @author Diego Iván Oliveros Acosta
 */
public class Multiplesclases {
     Multiplesclases(){
        System.out.println("Hola, mundo");
       }

       public static void main(String[] args){
          Multiplesclases mainC = new Multiplesclases();
          X my_x = new X();
          Y my_y = new Y();
          Z my_z = new Z();
       }
}


//otras clases
    class X{
       public X(){
         System.out.println("Hola desde X");
       }
    }

    class Y{
       public Y(){
         System.out.println("Hola desde Y");
       }
    }

    class Z{
       public Z(){
         System.out.println("Hola desde Z");
       }
    }
