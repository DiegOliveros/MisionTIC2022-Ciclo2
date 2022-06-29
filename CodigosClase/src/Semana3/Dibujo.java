
package Semana3;

/**
 * Diego Iván Oliveros Acosta
 * @scalapp.co ITOS 29/06/2022
 */
public class Dibujo {
    private int dx;
    private int dy;
    private int dz;
    
    public Dibujo(){   // método constructor de la clase
        // 1) se llama igual que la clase 
        // 2) arranca en mayúscula
        dx=dy=dz=0;
    }
    public Dibujo(int dx){
        this.dx=dx; //mismo nombre, distinta referencia
    }
    public Dibujo(int x,int y){
        this.dx=x;
        this.dx=y;
    }
    public Dibujo(int x,int y, int z){
        this.dx=x;
        this.dx=y;
        this.dx=z;
    }
    
}
