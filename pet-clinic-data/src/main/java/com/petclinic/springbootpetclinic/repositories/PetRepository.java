package com.petclinic.springbootpetclinic.repositories;

import com.petclinic.springbootpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}