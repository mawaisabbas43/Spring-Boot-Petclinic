package com.petclinic.springbootpetclinic.services;

import com.petclinic.springbootpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
