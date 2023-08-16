package com.kt.sfgpetclinicj8.model;

import java.time.LocalDate;

/**
 * Created by kontelk on 8/15/23.
 */
public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public Pet() {
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
