package com.sofka.retolistatareas.models;

import javax.persistence.*;
import java.io.Serializable;

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
    private Integer completed;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_lista", nullable = false)
    private Listing lista;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descripcion) {
        this.description = description;
    }

    public Integer getCompleted() {
        return completed;
    }

    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    public int getIdList() {
        return lista.getId();
    }

    public void setIdList(Listing lista) {
        this.lista = lista;
    }

}