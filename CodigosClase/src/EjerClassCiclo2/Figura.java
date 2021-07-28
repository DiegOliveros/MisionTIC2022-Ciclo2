/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerClassCiclo2;

/**
 *
 * @author diego
 */
public class Figura {

    String color;
    char caracter = '█';

    //tatic 
    public static void main(String[] arg) {
        int matriz[][] = new int[3][5];
        Figura objetoFigura = new Figura();
        objetoFigura.pintarFigura(matriz);

    }

    public void pintarFigura(int[][] matriz) {
        String arriba = "═";
        String abajo = "═";
        String[] esquinas = {"╔", "╗", "╚", "╝"};
        String lado1 = "║";
        System.out.println(esquinas[0] + arriba + arriba + esquinas[1]);
        System.out.println(lado1  + caracter + "" + lado1+ lado1);
        System.out.println(esquinas[2] + abajo + abajo + esquinas[3]);
        int columnas = matriz[0].length; // las columnas de la fila 0
        int filas = matriz.length;// las filas de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
            System.out.print(esquinas[0] + arriba + arriba + esquinas[1]);
            }System.out.println();
            for (int j = 0; j < columnas; j++) {
            System.out.print(lado1  + caracter + "" + lado1+ lado1);
            }System.out.println();
            for (int j = 0; j < columnas; j++) {
            System.out.print(esquinas[2] + abajo + abajo + esquinas[3]);
            }System.out.println();
        }

    }
}
