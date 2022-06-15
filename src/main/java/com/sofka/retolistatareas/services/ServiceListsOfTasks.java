package com.sofka.retolistatareas.services;

import com.sofka.retolistatareas.models.Listing;
import com.sofka.retolistatareas.models.Task;
import com.sofka.retolistatareas.repositories.IRepositoryListing;
import com.sofka.retolistatareas.repositories.IRepositoryTask;
import com.sofka.retolistatareas.services.Interfaces.IListsOfTasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class ServiceListsOfTasks implements IListsOfTasks {

    @Autowired
    IRepositoryListing repositoryListing;
    @Autowired
    IRepositoryTask repositoryTask;

    @Override
    public ArrayList<Listing> getLists() {
        return (ArrayList<Listing>) repositoryListing.findAll();
    }

    @Override
    public ArrayList<Task> getTasks() {
        return (ArrayList<Task>) repositoryTask.findAll();
    }

    @Override
    public Listing saveListing(Listing listing) {
        return repositoryListing.save(listing);
    }

    @Override
    public Task saveTask(Task task) {
        task.setCompleted(false);
        return repositoryTask.save(task);
    }
}
