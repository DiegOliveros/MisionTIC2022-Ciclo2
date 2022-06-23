package Semana1;


/**
 * Diego Iván Oliveros Acosta
 * @scalapp.co ITOS 21/06/2022
 */
public class ContadorCifras {

    public static void main(String[] args) {
        int numero2, numero = 654321;
        numero2 = numero;
        int contador = 0;
        while (numero > 0) {
            numero /= 10;
            contador++;
        }
        System.out.println(contador);
        //con el do while 
        System.out.println("con el do while");
        int contador2 = 0;
        do {
            numero2 /= 10;// numero2=numero2/10;
            contador2++;
        } while (numero2 > 0);
        System.out.println(contador2);

    }

}
