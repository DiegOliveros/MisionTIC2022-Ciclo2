

package Semana3;

import java.util.ArrayList;

/**
 * Diego Iván Oliveros Acosta
 * @scalapp.co ITOS 30/06/2022
 */
public class Universidad {

   
    public static void main(String args[]){

//Se declara e instancia un ArrayList de estudiantes
ArrayList<Estudiante> inscritos = new ArrayList<>();
//Se declaran e instancian los estudiantes de la clase existente
float notas[]=new float[]{1,2,5,5};
Estudiante primero = new Estudiante("Juan", "Pérez",16, notas);
Estudiante segundo = new Estudiante("Pedro","Cañas", 19, notas);
Estudiante tercero = new Estudiante("Lucas", "Ruiz",18, notas);
Estudiante cuarto = new Estudiante("Tomás", "Álvarez",21, notas);
//Se agregan los estudiantes al ArrayList
inscritos.add(primero);
inscritos.add(segundo);
inscritos.add(tercero);
inscritos.add(cuarto);
//Se verifica el tamaño del ArrayList
System.out.println(inscritos.size());
//Se elimina un elemento (el segundo)
inscritos.remove(1);
//Obtenemos el nombre del primer inscrito
System.out.println(inscritos.get(0).getNombres());
//Obtenemos el promedio del tercer inscrito
System.out.println(inscritos.get(2).getPromedio());
    }
}
