package com.sofka.retolistatareas.repositories;

import com.sofka.retolistatareas.models.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryTask extends CrudRepository<Task, Integer> {
}
