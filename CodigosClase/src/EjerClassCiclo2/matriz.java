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
public class matriz {
     public static void main(String[] args){
         int[][] mat = new int[3][3];
         for (int i =0; i<mat.length;i++){
         for (int j =0; j<mat[0].length;j++){
             System.out.print(mat[i][j]);
         }System.out.println();
         }
         System.out.println("Segundo caso");       
         mat=new int[8][5];
         int[][]mat2=new int[8][5];
          for (int i =0; i<mat.length;i++){
         for (int j =0; j<mat[0].length;j++){
             mat[i][j]=1;
             System.out.print(mat[i][j]);
         } System.out.println();
         }
         mat=new int[3][4];
         mat2=mat;
         System.out.println("Tercer caso"); 
          for (int i =0; i<mat2.length;i++){
         for (int j =0; j<mat2[0].length;j++){
             mat2[i][j]=2;
             System.out.print(mat2[i][j]);
         } System.out.println();
         } 
  }
}
