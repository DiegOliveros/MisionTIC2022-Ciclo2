
package Semana4;

import java.util.ArrayList;

/**
 * Diego Iván Oliveros Acosta
 * @scalapp.co ITOS 6/07/2022
 */
public class BiblioTK {
    int cantidadlibros;
    ArrayList<Libro> Libros =new ArrayList<Libro>();
    int secuencia;
    
    BiblioTK(){}
    
    public void agregar(Libro librox){
    Libros.add(librox);
    cantidadlibros=Libros.size();
    }
    
    public ArrayList listar(){
    return Libros;
    } 
    
    public void modificar(int id, Libro librox){
    }
    
    public void eliminar(int id){
    }
}
