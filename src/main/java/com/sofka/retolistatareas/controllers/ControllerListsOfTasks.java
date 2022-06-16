package com.sofka.retolistatareas.controllers;

import com.sofka.retolistatareas.models.Listing;
import com.sofka.retolistatareas.models.Task;
import com.sofka.retolistatareas.services.ServiceListsOfTasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Controlador para las listas de tareas
 *
 * @version 1.0.0 2022-06-16
 * @author Óscar Farfán <oscarfarfan92@gmail.com>
 * @since 1.0.0
 */
@CrossOrigin
@RestController
@RequestMapping("/")
public class ControllerListsOfTasks {

    /**
     * Servicio para el manejo de las listas de tareas
     */
    @Autowired
    ServiceListsOfTasks serviceListsOfTasks;

    /**
     * Endpoint para la consulta de las listas
     *
     * @return Objeto de las listas en formato JSON
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    @GetMapping("/listing")
    public ArrayList<Listing> getLists(){
        return serviceListsOfTasks.getLists();
    }

    /**
     * Endpoint para la creación de una nueva lista
     *
     * @param listing Lista a crear en el sistema
     * @return Objeto de la lista creada en formato JSON
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    @PostMapping("/listing")
    public Listing saveListing(@RequestBody Listing listing){
        return this.serviceListsOfTasks.saveListing(listing);
    }

    /**
     * Endpoint para la consulta de tareas
     *
     * @return Objeto de las tareas en formato JSON
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    @GetMapping("/task")
    public ArrayList<Task> getTasks(){
        return serviceListsOfTasks.getTasks();
    }

    /**
     * Endpoint para la creación de una nueva tarea
     *
     * @param task Tarea a crear en el sistema
     * @return Objeto de la tarea creada en formato JSON
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    @PostMapping("/task")
    public Task saveTask(@RequestBody Task task){
        return this.serviceListsOfTasks.saveTask(task);
    }

    /**
     * Borra una lista en el sistema
     *
     * @param id Identificador de la lista a borrar
     * @return mensaje de si fue posible eliminar la lista
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    @DeleteMapping(path = "/listing/{id}")
    public String deleteListing(@PathVariable("id") Integer id){
        boolean ok = this.serviceListsOfTasks.deleteListing(id);
        if (ok) {
            return "Se eliminó la lista con id " + id;
        } else {
            return "No se pudo eliminar la lista con id " + id;
        }
    }

    /**
     * Borra una tarea en el sistema
     *
     * @param id Identificador de la tarea a borrar
     * @return mensaje de si fue posible eliminar la tarea
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    @DeleteMapping(path = "/task/{id}")
    public String deleteTask(@PathVariable("id") Integer id){
        boolean ok = this.serviceListsOfTasks.deleteTask(id);
        if (ok) {
            return "Se eliminó la tarea con id " + id;
        } else {
            return "No se pudo eliminar la tarea con id " + id;
        }
    }

    /**
     * Actualiza todos los datos de una tarea
     *
     * @param id Identificador de la tarea a actualizar
     * @param task Objeto Tarea a actualizar
     * @return Objeto de la tarea actualizada en formato JSON
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    @PutMapping(path = "/task/{id}")
    public Task updateTask(@PathVariable("id") Integer id, @RequestBody Task task){
        return serviceListsOfTasks.updateTask(id, task);
    }
}
