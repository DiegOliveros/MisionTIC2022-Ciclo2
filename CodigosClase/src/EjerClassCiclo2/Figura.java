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
    char caracter1 = '█';
    char caracter2 = '░';

    //tatic 
    public static void main(String[] arg) {
        int matriz[][] = new int[3][5];
        matriz[1][2] =1;
        Figura objetoFigura = new Figura();
        objetoFigura.pintarFigura(matriz);

    }

    public void pintarFigura(int[][] matriz) {
        String arriba = "═";
        String abajo = "═";
        String[] esquinas = {"╔", "╗", "╚", "╝"};
        String lado1 = "║";
        int columnas = matriz[0].length; // las columnas de la fila 0
        int filas = matriz.length;// las filas de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
            System.out.print(esquinas[0] + arriba + arriba + esquinas[1]);
            }System.out.println();
            for (int j = 0; j < columnas; j++) {
                if(matriz[i][j]==1){
                System.out.print(lado1  + caracter1 + lado1+ lado1);
                }else{
                    System.out.print(lado1  + caracter2 + lado1+ lado1);
                }            
            }System.out.println();
            for (int j = 0; j < columnas; j++) {
            System.out.print(esquinas[2] + abajo + abajo + esquinas[3]);
            }System.out.println();
        }

    }
}
