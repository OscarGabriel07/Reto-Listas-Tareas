package com.sofka.retolistatareas.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "lista")
public class Listing implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String name;

    @OneToMany(mappedBy = "lista")
    private List<Task> tasks = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public List<Task> getTasks() {
        return tasks;
    }*/

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

}