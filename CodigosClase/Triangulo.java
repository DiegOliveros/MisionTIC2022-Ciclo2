package holamundo;
/**
 *13/07/2021
 * @author Diego Iván Oliveros Acosta
 */
import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        int i=0,j=0, acum=0;
        
        while(i<10){
            i+=1;
            j+=1;
            if (i == 1) {
                System.out.println("i = " + 1 + " j = " + 41);
            } else {
                System.out.println("i = " + i + " j = " + i * 2);//j=i*2;
            }
            acum+=1;
            System.out.println("El contador es:"+acum);
        }
        
    }
}
