package com.petclinic.springbootpetclinic.model;

import services.map.AbstractMapService;

public class PetType extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
