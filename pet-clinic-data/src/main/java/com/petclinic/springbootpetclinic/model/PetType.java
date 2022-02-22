package com.petclinic.springbootpetclinic.model;

import lombok.*;

import javax.persistence.Entity;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PetType extends BaseEntity {
    private String name;

}
