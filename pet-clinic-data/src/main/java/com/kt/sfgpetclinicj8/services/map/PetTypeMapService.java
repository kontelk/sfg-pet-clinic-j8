package com.kt.sfgpetclinicj8.services.map;

import com.kt.sfgpetclinicj8.model.PetType;
import com.kt.sfgpetclinicj8.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by kontelk on 8/23/23.
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long>
        implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
