package com.sofka.retolistatareas.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Entidad de la Tarea
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 16-06-2022
 */
@Data
@Entity
@Table(name = "tarea")
public class Task implements Serializable {

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
     * Descripción de la tarea
     */
    @Column(name = "descripcion", nullable = false, length = 300)
    private String description;

    /**
     * Estado de completado de la tarea
     */
    @Column(name = "completado")
    private Boolean completed;

    /**
     * Punto de enlace con la entidad lista (una lista puede tener muchas tareas)
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_lista", nullable = false)
    @JsonBackReference
    private Listing lista;

}