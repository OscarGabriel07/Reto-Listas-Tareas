package com.sofka.retolistatareas.repositories;

import com.sofka.retolistatareas.models.Listing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad Telefono
 *
 * @version 1.0.0 2022-06-16
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 * @since 1.0.0
 */
@Repository
public interface IRepositoryListing extends CrudRepository<Listing, Integer> {
}
