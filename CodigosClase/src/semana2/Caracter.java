package semana2;

/**
 * 23 junio 2022
 * @author Diego Iván Oliveros Acosta @author ITOS
 */
public class Caracter {
    public static void main(String[] args) {
        char a=65;  //datos primitivos 
        a='6';
        System.out.println(a);   
        int num1=2;  //entero 1  datos primitivos 
        int num2=4;  //entero 1
        String str1 =new String("= Num 1 + Num2");  //ojeto de tipo String 
        String str2 =new String("Num 1 + Num2 =");
     
        System.out.println(num1+num2+str1);//POLIMORFISMO
        System.out.println(str2+num1+num2);
    }
  
}
