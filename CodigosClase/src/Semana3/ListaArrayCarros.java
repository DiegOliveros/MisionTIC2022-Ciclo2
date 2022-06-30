package Semana3;

import java.util.ArrayList;//importando la clase Arraylist
import java.util.Scanner;

/**
 * Diego Iván Oliveros Acosta
 *
 * @scalapp.co ITOS 30/06/2022
 */
public class ListaArrayCarros {

    public static void main(String args[]) {

        ArrayList<String> carros = new ArrayList<String>(); //constructor de la clase Arraylist 
// Usando los métodos de la clase
        ListaArrayCarros objeto = new ListaArrayCarros();
        objeto.rellenarlista(carros);
        objeto.mostrarlista(carros);
// de manera manual 
        carros.add("Mazda");
        carros.add("Chevrolet");
        carros.add("Toyota");
        carros.add("Mercedes");
        carros.add("Ford");
        carros.add("Audi");
        carros.add("Ferrari");
    // recorriendo la estructura     
        for (String i : carros) {
            System.out.println(i);
        }

    }

    public void rellenarlista(ArrayList<String> carros) {
        Scanner num_sc = new Scanner(System.in);  //creo un objeto de la clase Scaner
        System.out.println("Ingrese el tamaño de la lista");
        int x = num_sc.nextInt();
        for (int i = 0; i < x; i++) {
            //Scanner texto_sc = new Scanner(System.in);
            System.out.print("Ingese una marca de Vehiculo:");
            String nombre = num_sc.next();
            carros.add(nombre);
        }

    }

    public void mostrarlista(ArrayList<String> carros) {
        System.out.println(carros);
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
    }
}
