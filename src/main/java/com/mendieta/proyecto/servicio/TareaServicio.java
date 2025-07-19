package com.mendieta.proyecto.servicio;

import com.mendieta.proyecto.modelo.Tarea;
import java.util.ArrayList;
import java.util.List;

/**
 * Servicio que gestiona la lista de tareas.
 */
public class TareaServicio {
    private final List<Tarea> tareas = new ArrayList<>();

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public List<Tarea> obtenerTareas() {
        return tareas;
    }
}