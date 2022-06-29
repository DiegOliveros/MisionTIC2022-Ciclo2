
package Semana3;

/**
 * Diego Iván Oliveros Acosta
 * @scalapp.co ITOS 29/06/2022
 */
public class ClaseArray {

    int [][] matriz_enteros ={{1,2,3,4,5},{10,9,8},{6565,55,88,9}};
    
    public void imprimirArray(int [][] Arreglo){
        //String a="";
    for(int i =0; i<Arreglo.length;i++){
        //apuntador System.out.println(Arreglo_enteros[i]);
        for(int j=0; j<Arreglo[i].length;j++){
            System.out.print(Arreglo[i][j]+",");
            //a=a+String.valueOf(Arreglo[i][j]);
            
        }
        System.out.println();
        
    }
        
    }
    
    public static void main(String xx[]){
        String[] args;
        String[] carros;
        String[] razas={"Poodle", "Bulldog","Chihuahua","Labrador","Pincher","Dalmata"};
        int[] mis_edades ={10,11,5,1};
        
        for(int i=0;i<razas.length;i++){
            System.out.print(razas[i]+" ");
        }
        ClaseArray unArreglo =new ClaseArray();
        
        System.out.println("La longitud del arreglo es:"+razas.length);
        System.out.println(unArreglo.matriz_enteros[0][4]);
        System.out.println("la longitud del arreglo"+unArreglo.matriz_enteros.length);
        System.out.println(unArreglo.matriz_enteros[0].length);
        System.out.println(unArreglo.matriz_enteros[1].length);
        System.out.println(unArreglo.matriz_enteros[2].length);
        unArreglo.imprimirArray(unArreglo.matriz_enteros);
    }
    
    
}
