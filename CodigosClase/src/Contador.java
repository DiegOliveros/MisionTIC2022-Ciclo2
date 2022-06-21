
/**
 *
 * @author ITOS
 */
public class Contador {
    public static void main(String[] args) {
        int inicial, final_1 = 10000, contador = 0;//iniciamos el contador
        for (inicial = 0; inicial <= final_1; inicial++) {
            if (inicial % 20 == 0) { //si el valor es un múltiplo de 20
                contador++; //contador=contador+1; o contador+=1;
            }
        }
        System.out.println("El número de múltiplos es: " + contador+" entre el"
                + " valor "+(inicial-final_1-1)+ " y "+final_1);
    }
}
