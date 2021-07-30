/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerClassCiclo2;

import EjerClassCiclo2.Figura;

/**
 * 28/07/2021
 *
 * @author Diego Iván Oliveros Acosta
 */
public class CalcularA {

    int iteraciones;

    public static void main(String args[]) throws InterruptedException {
        //CalcularA cal = new CalcularA();
        Figura pintar = new Figura();//instanciado un objeto de la clase figura 
        int nitera = 6;
        int[][] base = CalcularA.matriz();
        pintar.pintarFigura(base); //manejando mètodos estáticos 
        for (int i = 0; i < nitera-1; i++) {
            int[][] mext = CalcularA.matriznext(base);
            Thread.sleep(5);
            System.out.println("Siguiente iteración:");
            System.out.println(calcularArea2(mext));
            pintar.pintarFigura(mext);
            base = mext;
        }

        System.out.println("El área es:" + calcularArea(base));
        System.out.println("El área es:" + calcularArea2(nitera));
    }

    static int calcularArea(int matriz[][]) {
        int area = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == 1) {
                    area++;
                }
            }
        }
        return area;
    }

    static int calcularArea2(int intera) {
        int n = intera;
        int area=0;
        for (int i = 0; i < n; i++) {
            area = (i * i + (i + 1) * (i + 1));
        }
        return area;
    }
    static int calcularArea2(int[][] mat) {
        int n = mat.length;
        int intera=((n-1)/2)-1;
        return calcularArea2(intera);
    }

    static int[][] matriz() {
        int[][] mat = new int[3][3];
        mat[1][1] = 1;
        return mat;
    }

    static int[][] matriznext(int[][] mat) {
        int[][] Mnext = new int[mat.length + 2][mat.length + 2];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == 1) {
                    Mnext[i][j + 1] = 1;  //arriba
                    Mnext[i + 2][j + 1] = 1;  //abajo
                    Mnext[i + 1][j + 1] = 1;  //centro
                    Mnext[i + 1][j + 2] = 1;  //derecha
                    Mnext[i + 1][j] = 1;  //izquierda
                }

            }
        }
        return Mnext;
    }
}
