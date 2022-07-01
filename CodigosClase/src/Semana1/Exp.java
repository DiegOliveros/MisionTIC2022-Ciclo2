package Semana1;


/**
 * Diego Iván Oliveros Acosta
 * @scalapp.co ITOS 17/06/2022
 */
public class Exp {

   
    public static void main(String args[]){
        int a =16, c=4*5, d=8+1;
        double e= 5/2;
        boolean b=true;
        System.out.println(a>c && e<=d);
        System.out.print(b || (d-e) >a/c);
        System.out.println(!b);
        System.out.println(!b && c < d || a/d <= e);
        //"casting" "paceo"
        String f = String.valueOf(a);
        char assci_A='A';
        int h =Character.valueOf(assci_A);
        System.out.println(h);
        System.out.println("El valor de h es:"+h);
        System.out.println("El valor de h como char es:"+assci_A);
         

        
    }
}
