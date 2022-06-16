package com.sofka.retolistatareas.services.Interfaces;

import com.sofka.retolistatareas.models.Listing;
import com.sofka.retolistatareas.models.Task;
import java.util.ArrayList;

/**
 * Interface para el servicio de Lista de Tareas
 *
 * @version 1.0.0 2022-06-16
 * @author Óscar Farfán <oscarfarfan92@gmail.com>
 * @since 1.0.0
 */
public interface IListsOfTasks {

    /**
     * Devuelve una lista de listas
     *
     * @return lista de listas
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    public ArrayList<Listing> getLists();

    /**
     * Devuelve una lista de tareas
     *
     * @return lista de tareas
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    public ArrayList<Task> getTasks();

    /**
     * Crea una lista en el sistema
     *
     * @param listing Objeto de la lista a crear
     * @return Objeto de la lista creada
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    public Listing saveListing(Listing listing);

    /**
     * Crea una tarea en el sistema a nombre de una lista
     *
     * @param task Objeto de la tarea a crear
     * @return Objeto de la tarea creada
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    public Task saveTask(Task task);

    /**
     * Borra una lista en el sistema basado en su identificador
     *
     * @param id Identificación de la lista a borrar
     * @return Valor Boolean del resultado de la eliminación
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    public Boolean deleteListing(Integer id);

    /**
     * Borra una tarea en el sistema basado en su identificador
     *
     * @param id Identificación de la tarea a borrar
     * @return Valor Boolean del resultado de la eliminación
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    public Boolean deleteTask(Integer id);

    /**
     * Actualiza una tarea a partir de su identificación
     *
     * @param id Identificación de la tarea a actualizar
     * @param task Objeto de la tarea a actualizar
     * @return Objeto de la tarea actualizada
     *
     * @author Óscar Farfán <oscarfarfan92@gmail.com>
     * @since 1.0.0
     */
    public Task updateTask(Integer id, Task task);

}
