package Semana4;

import java.util.ArrayList;

/**
 * Diego Iván Oliveros Acosta
 *
 * @scalapp.co ITOS 6/07/2022
 */
public class Libro {

    private String titulo;
    private int codigo;
    private Persona autor;
    private int anio;

    Libro(String titulo, int codigo, Persona autor, int anio) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.autor = autor;
        this.anio = anio;
    }

}
