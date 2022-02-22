package com.petclinic.springbootpetclinic.model;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "owners")//optional by default it will be same
public class Owner extends Person{
    private String address;
    private String city;
    private String telephone;
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private Set<Pet> pets = new java.util.LinkedHashSet<>();

    @Builder
    public Owner(Long id, String firstName, String lastName, String address, String city, String telephone, Set<Pet> pets) {
        super(id, firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }
}
