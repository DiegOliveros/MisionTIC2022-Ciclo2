package Semana7;

/**
 *
 * @author ITOS
 */
public class Control {
     public static void main(String args[]) {
        Modelo conectorBaseBibliotk = new Modelo();
//        conectorBaseBibliotk.insertar();
//        
        String clave = "123*";
        System.out.println(conectorBaseBibliotk.md5(clave));
        System.out.println(conectorBaseBibliotk.SHA1(clave));
        conectorBaseBibliotk.insertar(14, "usuarioencriptado", "123*");
        conectorBaseBibliotk.leer();
    }
}
