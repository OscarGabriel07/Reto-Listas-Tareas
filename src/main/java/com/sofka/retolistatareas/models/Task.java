package com.sofka.retolistatareas.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tarea")
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "descripcion", nullable = false, length = 300)
    private String description;

    @Column(name = "completado")
    private Boolean completed;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Listing.class, optional = false)
    @JoinColumn(name = "id_lista", nullable = false)
    @JsonBackReference
    private Listing lista;

}