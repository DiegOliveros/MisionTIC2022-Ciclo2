/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerClassCiclo2;

/**
 * 28/07/2021
 * @author Diego Iván Oliveros Acosta
 */
public class CalcularA {

    int iteraciones;

    public static void main(String args[]) {
        CalcularA cal = new CalcularA();
        Figura pintar = new Figura();
        pintar.pintarFigura(cal.matriz());
        int[][] mext =cal.matriznext(cal.matriz());
        pintar.pintarFigura(cal.matriz());
        System.err.println("Siguiente iteración:");
        pintar.pintarFigura(mext);
    }

    public int[][] matriz() {
        int[][] mat = new int[3][3];
        mat[1][1] = 1;
        return mat;
    }

    public int[][] matriznext(int[][] mat) {
        int[][] Mnext = new int[mat.length + 2][mat.length + 2];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(mat[i][j]==1){
                Mnext[i][j+1]=1;  //arriba
                Mnext[i+2][j+1]=1;  //abajo
                Mnext[i+1][j+1]=1;  //centro
                Mnext[i+1][j+2]=1;  //derecha
                Mnext[i+1][j]=1;  //izquierda
                }
                
            }
        }
        return Mnext;
    }
}
