package com.sofka.retolistatareas.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "lista")
public class Listing implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String name;

    @OneToMany(fetch = FetchType.EAGER,
            targetEntity = Task.class,
            cascade = CascadeType.REMOVE,
            mappedBy = "lista")
    @JsonManagedReference
    private List<Task> tasks = new ArrayList<>();

}