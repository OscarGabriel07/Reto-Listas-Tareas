package com.sofka.retolistatareas.repositories;

import com.sofka.retolistatareas.models.Listing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryListing extends CrudRepository<Listing, Integer> {
}
