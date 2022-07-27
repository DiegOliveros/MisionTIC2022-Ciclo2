package Semana7;

/**
 *
 * @author ITOS
 */
public class Control {
     public static void main(String args[]) {
//        Modelo conectorBaseBibliotk = new Modelo();
////        conectorBaseBibliotk.insertar();
////        
//        String clave = "123*";
//        System.out.println(conectorBaseBibliotk.md5(clave));
//        System.out.println(conectorBaseBibliotk.SHA1(clave));
//        conectorBaseBibliotk.insertar(conectorBaseBibliotk.readLastID()+1, "usuarioencriptado", "123*");
//        conectorBaseBibliotk.leer();
        Persona Usuario = new Persona("lucia2","*88");
         System.out.println(validar(Usuario));
         System.out.println(cifrar("*88"));
         Persona Usuario2 = new Persona("juan","123*");
         System.out.println(validar(Usuario2));
         System.out.println(cifrar("123*"));

    }
     
     public static int validar(Persona usuario){//String usuario, String contrasena
       Modelo model = new Modelo();
         //si persona y usuario son correctos => validar=1
         String [] UC =usuario.getusuariocontraseña();
         
        System.out.println(UC[0]+UC[1]);
         //Si no =>validar =0
        // System.out.println(model.validar(UC[0],UC[1]));
         
     return model.validar(UC[0],UC[1]);
     }
     
     public static String cifrar(String pass){
         Modelo model = new Modelo();
         pass= model.md5(pass);
     return pass;
     }
     
}
