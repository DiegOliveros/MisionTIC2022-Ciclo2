package semana2;

import java.util.Scanner;

/**
 * 23 junio 2022
 * @author Diego Iván Oliveros Acosta @author ITOS
 */
public class Scaner1 {
    public static void main(String[] args) {
//        Scanner entrada;
//        entrada=new Scanner(System.in);
        Scanner entrada=new Scanner(System.in);
        Scanner otroObjetoScaner=new Scanner(System.in);
        System.out.println("Ingrese un Dato");
        String cadena =entrada.next();
        System.out.println("El Dato es:"+cadena);
        System.out.println("El Dato es:"+(Integer.parseInt(cadena)+10));
    }
}
