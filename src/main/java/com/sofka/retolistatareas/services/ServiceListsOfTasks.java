package com.sofka.retolistatareas.services;

import com.sofka.retolistatareas.models.Listing;
import com.sofka.retolistatareas.models.Task;
import com.sofka.retolistatareas.repositories.IRepositoryListing;
import com.sofka.retolistatareas.repositories.IRepositoryTask;
import com.sofka.retolistatareas.services.Interfaces.IListsOfTasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

/**
 * Clase tipo Servicio para el manejo de las listas de tareas
 *
 * @version 1.0.0 2022-06-16
 * @author Óscar Farfán <oscarfarfan92@gmail.com>
 * @since 1.0.0
 */
@Service
public class ServiceListsOfTasks implements IListsOfTasks {

    /**
     * Repositorio de la lista
     */
    @Autowired
    IRepositoryListing repositoryListing;

    /**
     * Repositorio de la tarea
     */
    @Autowired
    IRepositoryTask repositoryTask;

    /**
     * Devuelve una lista de listas con todas las tareas del sistema
     *
     * @return lista de listas
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    @Override
    public ArrayList<Listing> getLists() {
        return (ArrayList<Listing>) repositoryListing.findAll();
    }

    /**
     * Devuelve una lista de las tareas guardadas en el sistema
     *
     * @return lista de tareas
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    @Override
    public ArrayList<Task> getTasks() {
        return (ArrayList<Task>) repositoryTask.findAll();
    }

    /**
     * Crea una lista en el sistema
     *
     * @param listing Objeto de la lista a crear
     * @return Objeto de la lista creada
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    @Override
    public Listing saveListing(Listing listing) {
        return repositoryListing.save(listing);
    }

    /**
     * Crea una tarea en el sistema
     *
     * @param task Objeto de la tarea a crear
     * @return Objeto de la tarea creada
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    @Override
    public Task saveTask(Task task) {
        task.setCompleted(false);
        return repositoryTask.save(task);
    }

    /**
     * Elimina una lista del sistema basado en su identificación
     *
     * @param id Identificación de la lista a borrar
     * @return verdadero si se pudo borrar la lista y falso si no
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    @Override
    public Boolean deleteListing(Integer id) {
        try {
            repositoryListing.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * Elimina una tarea del sistema basado en su identificación
     *
     * @param id Identificación de la tarea a borrar
     * @return verdadero si se pudo borrar la tarea y falso si no
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    @Override
    public Boolean deleteTask(Integer id) {
        try {
            repositoryTask.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * Actualiza una tarea basado en su identificación
     *
     * @param id Identificación de la tarea a actualizar
     * @param task Objeto de la tarea a actualizar
     * @return Objeto de la tarea actualizada
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    @Override
    public Task updateTask(Integer id, Task task) {
        task.setId(id);
        return repositoryTask.save(task);
    }


}
