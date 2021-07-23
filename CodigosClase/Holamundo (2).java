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
public class Holamundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    }

    public int add(int param1, int param2) {

        return param1 + param2;
    }

    public int add2(int param1, int param2) {
        int param3 = param1 + param2;
        return param3;

    }

    public void add3(int param1, int param2) {
        int param3 = param1 + param2;
        System.out.println("El resultado es: " + param3);

    }

    public void add4(int param1, int param2) {

        System.out.println("El resultado es: " + (param1 + param2));
        System.out.println("El resultado es: " + param1+ param2);
    }

}
