package Semana3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Diego Iván Oliveros Acosta
 *
 * @scalapp.co ITOS 30/06/2022
 */
public class ClaseArray2 {

    public static void main(String args[]) {
        Scanner tamanio_sc = new Scanner(System.in);  //creo un objeto de la clase Scaner
        System.out.println("Ingrese el tamaño del arreglo");
        //Integer tamanio_array =tamanio_sc.nextInt(); 
        int tamanio_array = tamanio_sc.nextInt();
        int arreglo[] = new int[tamanio_array];
        ClaseArray2 objeto = new ClaseArray2();
        objeto.rellenarArray(arreglo);//rellenarArray(arreglo);
        objeto.mostrarArray(arreglo);//mostrarArray(arreglo);
    }

    public void rellenarArray(int array[]) {
        Scanner texto_sc = new Scanner(System.in);  //creo un objeto de la clase Scaner

        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingese un valor:");
            array[i] = texto_sc.nextInt();
        }

    }

    public void mostrarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("En el índice"+i+" tenemos el valor"+String.valueOf(array[i]));
        
        }

   }}
