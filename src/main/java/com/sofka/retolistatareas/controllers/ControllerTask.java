package com.sofka.retolistatareas.controllers;

import com.sofka.retolistatareas.models.Task;
import com.sofka.retolistatareas.services.ServiceTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/task")
public class ControllerTask {

    @Autowired
    ServiceTask serviceTask;

    @GetMapping()
    public ArrayList<Task> getTasks(){
        return serviceTask.getTasks();
    }
}
