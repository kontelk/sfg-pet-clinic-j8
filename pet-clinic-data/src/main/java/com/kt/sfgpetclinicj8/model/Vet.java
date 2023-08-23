package com.kt.sfgpetclinicj8.model;

import java.util.Set;

/**
 * Created by kontelk on 8/15/23.
 */
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
