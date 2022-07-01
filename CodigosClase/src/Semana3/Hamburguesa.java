
package Semana3;

/**
 * Diego Iván Oliveros Acosta
 * @scalapp.co ITOS 1/07/2022
 */
public class Hamburguesa extends Alimentos{
    String tipo;
   Hamburguesa(String nombre, int precio, String tipo){
   super(nombre,precio);
   this.tipo=tipo;
   }
    public static void main(String args[]){
        Hamburguesa corral = new Hamburguesa("corral",12000, "Especial");
        System.out.println("El nombre es:"+corral.nombre);
        System.out.println("El precio es:"+corral.precio);
        System.out.println("El tipo es:"+corral.tipo);
    }
    
}
