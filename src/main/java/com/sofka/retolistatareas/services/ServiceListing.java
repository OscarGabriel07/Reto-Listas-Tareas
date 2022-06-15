package com.sofka.retolistatareas.services;

import com.sofka.retolistatareas.models.Listing;
import com.sofka.retolistatareas.repositories.IRepositoryListing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServiceListing {

    @Autowired
    IRepositoryListing repositoryListing;

    public ArrayList<Listing> getLists(){
        return (ArrayList<Listing>) repositoryListing.findAll();
    }

    public Listing saveListing(Listing listing){
        return repositoryListing.save(listing);
    }
}
