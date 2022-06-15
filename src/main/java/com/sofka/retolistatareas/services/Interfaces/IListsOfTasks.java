package com.sofka.retolistatareas.services.Interfaces;

import com.sofka.retolistatareas.models.Listing;
import com.sofka.retolistatareas.models.Task;
import java.util.ArrayList;

public interface IListsOfTasks {


    public ArrayList<Listing> getLists();

    public ArrayList<Task> getTasks();

    public Listing saveListing(Listing listing);

    public Task saveTask(Task task);

    public Boolean deleteListing(Integer id);

    public Boolean deleteTask(Integer id);

    public Task updateTask(Integer id, Task task);

}
