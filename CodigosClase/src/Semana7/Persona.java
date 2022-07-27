
package Semana7;

import Semana4.*;

/**
 * Diego Iván Oliveros Acosta
 * @scalapp.co ITOS 6/07/2022
 */
public class Persona {
    private String nombre2;
    private String apellido2;
    private String nombre1;
    private String apellido1;
    private String usuario="admin";
    private String password="admin";
    
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
   
    public String getNombre2() {
        return nombre2;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getApellido1() {
        return apellido1;
    }
   
    public String [] getusuariocontraseña() {
        String [] UC =new String []{usuario,password};
        return UC;
    }
   
   Persona(String usuario,String password){
       this.usuario =usuario;
       this.password =password;
   }
}
