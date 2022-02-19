package com.petclinic.springbootpetclinic.repositories;

import com.petclinic.springbootpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}