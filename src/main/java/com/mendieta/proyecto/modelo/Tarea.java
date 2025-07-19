package com.mendieta.proyecto.modelo;

/**
 * Clase que representa una tarea.
 */
public class Tarea {
    private String titulo;
    private String descripcion;

    public Tarea(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    /**
     * Constructor que permite crear una tarea con título y descripción.
     */
    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Tarea: " + titulo + " - " + descripcion;
    }
}