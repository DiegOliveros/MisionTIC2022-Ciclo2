package semana2;

/**
 *
 * @author ITOS
 */
public class Perro {

    int edad,patas;//campos, atributos, características:
    String nombre,raza;
    Boolean genero;
    
//comportamiento, método, funcion ejemplo: (main, constructor, set, get)
    Perro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    Perro() {

    }   
    void ladrar() {
        System.out.println("El perro " + this.nombre + " dice: ¡Guauuu!");
    }
    public static void main(String[] args) {
        Perro objeto_perro = new Perro("firulais", 1);
        Perro un_perro = new Perro("roky", 1);
        Perro tres = new Perro();
        tres.nombre="Perro3";
        objeto_perro.ladrar();
        un_perro.ladrar();
        tres.ladrar();
    }
}
