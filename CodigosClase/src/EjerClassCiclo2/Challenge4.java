/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerClassCiclo2;

import java.util.Scanner;

/**
 *2021 07 24
 * @author Diego Iván Oliveros Acosta
 */
public class Challenge4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Ingrese el tamaño del vector?: ");
        int tamanio = sc.nextInt();
        int vectorint[] = new int[tamanio]; //Declaro el vector de enteros
        for(int i=0;i<vectorint.length;i++){
            System.out.println("Digite el valvoidor :"+(i+1));
            vectorint[i]=sc.nextInt();
        }
        Challenge4 ch = new Challenge4();
        System.out.println(ch.adjacentElementsProduct(vectorint));
    }

    public int adjacentElementsProduct(int vectorint[]) {
        int max2=vectorint[0]*vectorint[1];
        int max=0;
        for(int x=1;x<vectorint.length-1;x++){   //x=x+1 
            max = vectorint[x] * vectorint[x + 1];
            if (max > max2) {
                max2 = max;
            }
        }
        return max2;
    }
}
    

