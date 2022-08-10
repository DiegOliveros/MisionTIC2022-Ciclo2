    package Semana4;

/**
 * Diego Iván Oliveros Acosta
 *
 * @scalapp.co ITOS 8/07/2022
 */
public class Empleado {
//atributos del empleado

    private String Nombreprivado = "nombrepordefetoprivado";   //evita que los deje nulos 
    public String Nombrepublico = "nombrepordefetopublico";
    protected String Nombreprotegido = "nombrepordefetoprotegido";
    /**
     * @return the Nombreprivado
     */
    public String getNombreprivado() {
        return Nombreprivado;
    }

    /**
     * @param Nombreprivado the Nombreprivado to set
     */
    public void setNombreprivado(String Nombreprivado) {
        this.Nombreprivado = Nombreprivado;
    }


    //el método constructor de la clase
    // no tiene esta parte del código #### public void 
    Empleado(String Nombreprivadox, String Nombrepublicox, String Nombreprotegidox) {
        this.setNombreprivado(Nombreprivadox);
        this.Nombrepublico = Nombrepublicox;
        this.Nombreprotegido = Nombreprotegidox;
    }
    //usando polimorfismo puedo tener otro constructor

    Empleado() {
    }  //constructor vacío --permite crear empleados sin parámetros

    Empleado(String Nombreprivadox) {//constructor con un solo parámetros
        this.setNombreprivado(Nombreprivadox);
    }

    public void setNombre(String Nombreprivadox, String Nombrepublicox, String Nombreprotegidox) {
        this.setNombreprivado(Nombreprivadox);
        this.Nombrepublico = Nombrepublicox;
        this.Nombreprotegido = Nombreprotegidox;
    }

    public void imprimirnombre(Empleado objeto, String nombreobjeto){
    System.out.println("El nombre público de: "+nombreobjeto+" es: "+objeto.Nombrepublico);
    System.out.println("El nombre privado de: "+nombreobjeto+" es: "+objeto.getNombreprivado());
    System.out.println("El nombre privado de: "+nombreobjeto+" es: "+objeto.Nombreprotegido);
   
    }
}
