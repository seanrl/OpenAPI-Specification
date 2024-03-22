package com.github.seanrl.openapi;

import com.github.seanrl.openapi.api.PetsApi;
import com.github.seanrl.openapi.model.Pet;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

public class PetsImpl implements PetsApi {
    @Override
    public Response createPets(Pet pet) {
        //create a pet
        return Response.ok().build();
    }

    @Override
    public Response listPets(Integer limit) {
        List<Pet> pets = new ArrayList<>();
        //add pets
        return Response.ok(pets).build();
    }

    @Override
    public Response showPetById(String petId) {
        //get a pet
        return Response.ok(new Pet()).build();
    }
}
