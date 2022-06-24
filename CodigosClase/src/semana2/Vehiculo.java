package semana2;



/**
 * 24 junio 2022
 * @author Diego Iván Oliveros Acosta @author ITOS
 */
public class Vehiculo {
    public static void main(String[] args) {
        Pricipal uml = new Pricipal();
        uml.attributo1 = "texto de atrib1";
        uml.attributo3 = "texto de atrib3";
        uml.setAtributo2("texto de atrib2");
        System.out.println(uml.attributo1 +" "+
                   uml.attributo3 + " " + uml.getAtributo2());
    }
            
}
