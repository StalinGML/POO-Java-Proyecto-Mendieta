package com.mendieta.proyecto.vista;

import com.mendieta.proyecto.modelo.Tarea;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Muestra un mensaje de bienvenida en la consola.
 */

public class ConsolaVista {
    private final Scanner scanner = new Scanner(System.in);
 /**
     * Muestra un mensaje de bienvenida al usuario en la consola.
     */
    public void mostrarBienvenida() {
        System.out.println("========================================");
        System.out.println("    Bienvenido al Gestor de Tareas   ");
        System.out.println("========================================");
        System.out.println("    Controla y Organiza tus tareas");
    }

    public int mostrarMenu() {
        int opcion = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("\n-----MENU-----");
            System.out.println("1. Registrar tarea");
            System.out.println("2. Ver tareas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // limpiar buffer
                if (opcion >= 1 && opcion <= 3) {
                    entradaValida = true;
                } else {
                    System.out.println("Opción inválida, por favor ingrese 1, 2 o 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.nextLine(); // limpiar entrada inválida
            }
        }
        return opcion;
    }

    /**
     * Solicita al usuario el título y la descripción de una tarea.
     */
    public Tarea pedirTarea() {
        System.out.print("Título de la tarea: ");
        String titulo = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        return new Tarea(titulo, descripcion);
    }

    /**
     * Muestra la lista de tareas registradas.
     * Si no hay tareas, informa al usuario.
     * 
     * @param tareas lista de tareas a mostrar
     */
    public void mostrarTareas(List<Tarea> tareas) {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
        } else {
            System.out.println("\n--- Lista de Tareas ---");
            for (Tarea t : tareas) {
                System.out.println(t);
            }
        }
    }
}