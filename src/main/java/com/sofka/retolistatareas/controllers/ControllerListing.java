package com.sofka.retolistatareas.controllers;

import com.sofka.retolistatareas.models.Listing;
import com.sofka.retolistatareas.services.ServiceListing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/listing")
public class ControllerListing {

    @Autowired
    ServiceListing serviceListing;

    @GetMapping()
    public ArrayList<Listing> getLists(){
        return serviceListing.getLists();
    }

    @PostMapping()
    public Listing saveListing(@RequestBody Listing listing){
        return this.serviceListing.saveListing(listing);
    }
}
