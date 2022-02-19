package com.petclinic.springbootpetclinic.repositories;

import com.petclinic.springbootpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}