package com.kt.sfgpetclinicj8.services.map;

import com.kt.sfgpetclinicj8.model.Pet;
import com.kt.sfgpetclinicj8.services.PetService;

import java.util.Set;

/**
 * Created by kontelk on 8/19/23.
 */
public class PetServiceMap
        extends AbstractMapService<Pet, Long>
        implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
