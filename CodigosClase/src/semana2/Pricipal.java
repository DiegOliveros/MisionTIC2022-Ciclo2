package semana2;

/**
 *
 * @author ITOS
 */
public class Pricipal {

    //Parámetros de clase o atributos
    public String attributo1; // + attributo1:String 
    private String attributo2;//-  attributo2:String
    protected String attributo3;//# attributo3:String

    // Comportamientos, métodos de clase, f d clase. 
    public String getAtributo2() { //+ getAtributo2():String 
        return this.attributo2;
    }

    public void setAtributo2(String attributo2) { //+ setAtributo2(String):void
        this.attributo2 = attributo2; //parámetro asignado a la clase. 
    }

}
