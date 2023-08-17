package com.kt.sfgpetclinicj8.services;


import com.kt.sfgpetclinicj8.model.Pet;

import java.util.Set;

/**
 * Created by kontelk on 8/17/23.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
