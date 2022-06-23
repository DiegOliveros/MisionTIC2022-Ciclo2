package semana2;

/**
 * 23 junio 2022
 * @author Diego Iván Oliveros Acosta @author ITOS
 */
public class Perro {

    private int edad,patas;//campos, atributos, características:
    public String nombre,raza;
    protected Boolean genero;
    
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
    String ladrar2() {
        String cadena =("El perro " + this.nombre + " dice: ¡Guauuu!");
        return cadena;
    }
    public static void main(String[] args) {
        Perro objeto_perro = new Perro("firulais", 1);
        Perro un_perro = new Perro("roky", 1);
        Perro tres = new Perro();
        tres.nombre="Perro3";
        objeto_perro.ladrar();
        un_perro.ladrar();
        tres.ladrar(); 
        String ladrido=tres.ladrar2();  //solo retorna un string no lo imprime
        System.out.println(tres.ladrar2());
    }
}
