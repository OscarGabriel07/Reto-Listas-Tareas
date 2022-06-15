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

}
