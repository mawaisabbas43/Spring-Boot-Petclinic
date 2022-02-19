package com.petclinic.springbootpetclinic.repositories;

import com.petclinic.springbootpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}