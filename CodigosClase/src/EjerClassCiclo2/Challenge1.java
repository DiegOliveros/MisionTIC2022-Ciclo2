package EjerClassCiclo2;
/**
 *
 * @author Diego Iván Oliveros Acosta
 */
import java.util.Scanner;

public class Challenge1 {
    int attrib;
    public static void main(String[] args) {
        int y =2;
        int z=0;
        while(z<y){
            z++;
            Scanner sc= new Scanner(System.in);
            System.out.println("Ingrese el valor a: ");
            int valorA=sc.nextInt();
            System.out.println("Ingrese el valor b: ");
            int valorB=sc.nextInt();
            if(valorA>=-1000 && valorA<=1000 && valorB>=-1000 && valorB<=1000){
            Challenge1 x= new Challenge1();  // x es un objeto de la clase Challenge1
 
            System.out.println(x.add1(valorA, valorB));
            System.out.println(x.add2(valorA, valorB));
            x.add3(valorA, valorB);
            x.add4(valorA, valorB);
            }else{
                System.err.println("error, debe ingresar un valor entre -1000 y 1000");
            }
        }
    }

    public int add1(int param1, int param2) {
        return param1 + param2;
    }

    public int add2(int param1, int param2) {
        int param3 = param1 + param2;
        return param3;

    }

    public void add3(int param1, int param2) {
        int param3 = param1 + param2;
        System.out.println("El resultado es: " + param3);

    }

    public void add4(int param1, int param2) {
        System.out.println("El resultado es: " + (param1 + param2));
        System.out.println("El resultado es: " + param1+ param2);
    }

}

