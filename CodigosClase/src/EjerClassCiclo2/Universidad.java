/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerClassCiclo2;

/**
 *
 * @author Diego Iván Oliveros Acosta
 */
public class Universidad {

    public static void main(String[] args) {
        Persona Juan = new Persona("Juan", 3138554751l, "juan@gmail.com"); //Juan es un objeto de la clase Persona
        Estudiante Pedro = new Estudiante("Pedro", 3138554751l, "juan@gmail.com", 1, 5.0); //Juan es un objeto de la clase Persona
        Persona diego = new Persona("Diego", 300123123, "elprofe@gmail.com");
        Profesor elProfeDiego = new Profesor(diego, "2000000");
        Direccion direc=new Direccion("calle 1 no 32-8", "Medellín", "Antioquia", 11151,"Colombia");
        direc.imprimirDir();
    }

    public static class Persona {

        private String nombre;
        long telefono;
        String correo;
        Direccion dir;

        Persona(String nombre, long telefono, String correo) {
            this.correo = correo;
            this.nombre = nombre;
            this.telefono = telefono;
        }

        public void reservar() {
        }
    }

    public static class Estudiante extends Persona {

        int idEstudiante;
        double promedio;

        public Estudiante(String nombre, long telefono, String correo, int id, double prom) {
            super(nombre, telefono, correo);
            this.idEstudiante = id;
            this.promedio = prom;
        }
    }

    public static class Profesor extends Persona {

        int salario;

        public Profesor(Persona unaPersona, String sal) {
            super(unaPersona.nombre, unaPersona.telefono, unaPersona.correo);
            this.salario = Integer.parseInt(sal);
        }

    }

    public static class Direccion {
        String matricula,ciudad,departamento,pais;
        int codigoPostal;

        Direccion(String matr, String ciu, String dept, int CP, String pais) {
            this.matricula = matr;
            this.ciudad = ciu;
            this.departamento = dept;
            this.codigoPostal = CP;
            this.pais = pais;
        }

        public void validar() {
        }

        public void imprimirDir() {
            System.out.println("La dirección es: " + this.matricula + ", " + this.ciudad
                    + "," + this.departamento + ", " + this.pais + " y el código postal es:"
                    + this.codigoPostal);

        }
    }
}
