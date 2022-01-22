package com.petclinic.springbootpetclinic.bootstrap;

import com.petclinic.springbootpetclinic.model.*;
import com.petclinic.springbootpetclinic.services.OwnerService;
import com.petclinic.springbootpetclinic.services.PetTypeService;
import com.petclinic.springbootpetclinic.services.SpecialtyService;
import com.petclinic.springbootpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {
        int size = petTypeService.findAll().size();
        if(size==0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog=new PetType();
        dog.setName("Dog");
        PetType savedDog=petTypeService.save(dog);

        PetType cat=new PetType();
        cat.setName("Cat");
        PetType savedCat=petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("Johar Town Lahore");
        owner1.setCity("Lahore");
        owner1.setTelephone("+9212035680");

        Pet pet1=new Pet();
        pet1.setPetType(savedDog);
        pet1.setBirthDate(LocalDate.now());
        pet1.setName("Tomy");
        pet1.setOwner(owner1);
        owner1.getPets().add(pet1);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("Johar Town Lahore");
        owner2.setCity("Lahore");
        owner2.setTelephone("+9212035680");

        Pet fionasCat=new Pet();
        fionasCat.setPetType(savedCat);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setName("Tom");
        fionasCat.setOwner(owner2);
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);
        System.out.println("Loaded Owners....");

        Speciality radiology=new Speciality();
        radiology.setDescription("radiology");
        specialtyService.save(radiology);

        Speciality surgery=new Speciality();
        surgery.setDescription("surgery");
        specialtyService.save(surgery);

        Speciality dentistry=new Speciality();
        dentistry.setDescription("dentistry");
        specialtyService.save(dentistry);

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(radiology);
        vet1.getSpecialities().add(surgery);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(radiology);
        vet2.getSpecialities().add(dentistry);
        vet2.getSpecialities().add(surgery);

        vetService.save(vet2);
        System.out.println("Loaded Vets....");
    }
}
