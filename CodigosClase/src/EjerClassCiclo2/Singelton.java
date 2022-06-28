package EjerClassCiclo2;

/**
 *
 * @author ITOS
 */
public class Singelton {
    public static int foo =0;
    public static void main(String[] args) {
        Singelton a1= new Singelton();
         Singelton a2= new Singelton();
         a1.foo =10;
         System.out.println(a2.foo);
         a2.foo =25;
         System.out.println(a1.foo);
        
    }
}
