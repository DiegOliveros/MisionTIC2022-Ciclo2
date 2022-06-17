
import java.util.Scanner;

/**
 *
 * @author ITOS
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, p, sp;
        System.out.print("Introduzca la lngitud del primer lado");
        a=sc.nextDouble();
        System.out.print("Introduzca la lngitud del segundo lado");
        b=sc.nextDouble();
        System.out.print("Introduzca la lngitud del tercer lado");
        c=sc.nextDouble();
        p=a+b+c;
        sp=p/2;
        System.out.println("El área del "
        + "triangulo es: "+ Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c)));

    }

}
