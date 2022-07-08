package Semana4;

/**
 * Diego Iván Oliveros Acosta
 *
 * @scalapp.co ITOS 8/07/2022
 */
public class Empleado {
//atributos del empleado

    private String Nombreprivado = "nombrepordefeto";
    public String Nombrepublico = "nombrepordefeto";
    protected String Nombreprotegido = "nombrepordefeto";
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
    public void Empleado(String Nombreprivadox, String Nombrepublicox, String Nombreprotegidox) {
        this.setNombreprivado(Nombreprivadox);
        this.Nombrepublico = Nombrepublicox;
        this.Nombreprotegido = Nombreprotegidox;
    }
    //usando polimorfismo puedo tener otro constructor

    public void Empleado() {
    }  //constructor vacío --permite crear empleados sin parámetros

    public void Empleado(String Nombreprivadox) {//constructor con un solo parámetros
        this.setNombreprivado(Nombreprivadox);
    }

    public void setNombre(String Nombreprivadox, String Nombrepublicox, String Nombreprotegidox) {
        this.setNombreprivado(Nombreprivadox);
        this.Nombrepublico = Nombrepublicox;
        this.Nombreprotegido = Nombreprotegidox;
    }

}
