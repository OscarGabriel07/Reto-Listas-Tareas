package com.sofka.retolistatareas.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Entidad de la Lista
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 16-06-2022
 */
@Data
@Entity
@Table(name = "lista")
public class Listing implements Serializable {

    /**
     * Variable usada para manejar el tema del identificador de la tupla (consecutivo)
     */
    private static final long serialVersionUID = 1L;

    /**
     * Identificador de la tupla
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    /**
     * Nombre de la lista
     */
    @Column(name = "nombre", nullable = false, length = 100)
    private String name;

    /**
     * Punto de enlace entre la entidad Lista y Tarea (una lista puede tener muchas tareas)
     */
    @OneToMany(fetch = FetchType.EAGER,
            targetEntity = Task.class,
            cascade = CascadeType.REMOVE,
            mappedBy = "lista")
    @JsonManagedReference
    private List<Task> tasks = new ArrayList<>();

}