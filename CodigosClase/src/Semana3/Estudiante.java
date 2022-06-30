package Semana3;

/**
 * Diego Iván Oliveros Acosta
 *
 * @scalapp.co ITOS 30/06/2022
 */
public class Estudiante {

    private String Nombre;
    private String Apellido;
    private int edad;
    private float[] notas;

    public Estudiante(String Nombre, String Apellido, int edad, float[] notas) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.notas = notas;
    }

    public String getNombres() {
        String nombres = "El nombre es: " + this.Nombre + " y el apellido:" + this.Apellido;
        return nombres;
    }
    
}
