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
public class Perro {

    //Atributos
    String nombre;
    String raza;

    //Métodos constructores
   
    Perro(String nombre) {
        this.nombre = nombre;
    }
    Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    Perro(String nombre, int op) {
        this.nombre = nombre;
        if(op==1){
        this.raza = "Pastor";}
        else{this.raza = "Golden";}
    }
//Otros Métodos 
    void ladrar() {
        System.out.println("¡Guauu!"+"mi nombre es:"+this.nombre+"mi raza es:"+this.raza);
    }
    //Método principal
     public static void main(String[] args) {
        Perro roco = new Perro("roco");
        roco.raza = "Pastor";
        roco.ladrar();
        Perro Tako = new Perro("Tako", "Golden");
        Tako.ladrar();
        Perro Maximo = new Perro("Maximo", 80);
        Maximo.ladrar();
    }
}

