package com.mendieta.proyecto.dashboard;
/**
 * Proyecto: Gestor de Tareas - POO con Java
 * Autor: Stalin Mendieta
 * Descripción: Aplicación de consola para registrar y visualizar tareas
 */

import com.mendieta.proyecto.modelo.Tarea;
import com.mendieta.proyecto.servicio.TareaServicio;
import com.mendieta.proyecto.vista.ConsolaVista;

/**
 * Clase principal que gestiona el sistema de tareas.
 * @author Stalin
 */
public class Dashboard {

    private final TareaServicio servicio = new TareaServicio();
    private final ConsolaVista vista = new ConsolaVista();

    /**
     * Inicia el menú principal del sistema.
     */
    public void iniciar() {
        vista.mostrarBienvenida();
        int opcion;

        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1 -> servicio.agregarTarea(vista.pedirTarea());
                case 2 -> vista.mostrarTareas(servicio.obtenerTareas());
                case 3 -> System.out.println("Adiós...Gracias por usar el sistema!");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }

    /**
     * Método principal que lanza el sistema.
     * @param args argumentos de línea de comando
     */
    public static void main(String[] args) {
        new Dashboard().iniciar();
    }
}