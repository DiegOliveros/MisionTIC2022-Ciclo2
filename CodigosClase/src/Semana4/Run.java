
package Semana4;

/**
 * Diego Iván Oliveros Acosta
 * @scalapp.co ITOS 8/07/2022
 */
public class Run {

   
    public static void main(String args[]){
        Empleado juan = new Empleado();
        Empleado pedro =new Empleado("Pedro");
        Empleado ana= new Empleado("Ana", "María","de jesús");
        
        ana.imprimirnombre(juan, "juan");
        ana.imprimirnombre(pedro, "pedro");
        ana.imprimirnombre(ana, "ana");
        
        Operario diego =new Operario("Diego");
        
        diego.imprimirnombre(diego,"diego");
        
        System.out.println(diego.cargo);
        diego.setNombre("xx","xx","xx");  //heredado del padre "clase empleado"
        diego.imprimirnombre(diego,"diego");
    }
}
