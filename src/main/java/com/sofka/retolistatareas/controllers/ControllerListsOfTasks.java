package com.sofka.retolistatareas.controllers;

import com.sofka.retolistatareas.models.Listing;
import com.sofka.retolistatareas.models.Task;
import com.sofka.retolistatareas.services.ServiceListsOfTasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/")
public class ControllerListsOfTasks {

    @Autowired
    ServiceListsOfTasks serviceListsOfTasks;

    @GetMapping("/listing")
    public ArrayList<Listing> getLists(){
        return serviceListsOfTasks.getLists();
    }

    @PostMapping("/listing")
    public Listing saveListing(@RequestBody Listing listing){
        return this.serviceListsOfTasks.saveListing(listing);
    }

    @GetMapping("/task")
    public ArrayList<Task> getTasks(){
        return serviceListsOfTasks.getTasks();
    }

    @PostMapping("/task")
    public Task saveTask(@RequestBody Task task){
        return this.serviceListsOfTasks.saveTask(task);
    }

    @DeleteMapping(path = "/listing/{id}")
    public String deleteListing(@PathVariable("id") Integer id){
        boolean ok = this.serviceListsOfTasks.deleteListing(id);
        if (ok) {
            return "Se eliminó la lista con id " + id;
        } else {
            return "No se pudo eliminar la lista con id " + id;
        }
    }
    @DeleteMapping(path = "/task/{id}")
    public String deleteTask(@PathVariable("id") Integer id){
        boolean ok = this.serviceListsOfTasks.deleteTask(id);
        if (ok) {
            return "Se eliminó la tarea con id " + id;
        } else {
            return "No se pudo eliminar la tarea con id " + id;
        }
    }

    @PutMapping(path = "/task/{id}")
    public Task updateTask(@PathVariable("id") Integer id, @RequestBody Task task){
        return serviceListsOfTasks.updateTask(id, task);
    }
}
