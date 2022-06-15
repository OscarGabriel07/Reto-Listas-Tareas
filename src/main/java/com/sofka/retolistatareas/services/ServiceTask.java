package com.sofka.retolistatareas.services;

import com.sofka.retolistatareas.models.Task;
import com.sofka.retolistatareas.repositories.IRepositoryTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServiceTask {

    @Autowired
    IRepositoryTask repositoryTask;

    public ArrayList<Task> getTasks(){
        return (ArrayList<Task>) repositoryTask.findAll();
    }
}
