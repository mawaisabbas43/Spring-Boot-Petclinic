package com.petclinic.springbootpetclinic.repositories;

import com.petclinic.springbootpetclinic.model.Owner;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
