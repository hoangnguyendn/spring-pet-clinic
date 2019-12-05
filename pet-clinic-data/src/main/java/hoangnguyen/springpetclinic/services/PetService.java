package hoangnguyen.springpetclinic.services;

import hoangnguyen.springpetclinic.models.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}