package com.kt.sfgpetclinicj8.model;

import java.util.Set;

/**
 * Created by kontelk on 8/15/23.
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
