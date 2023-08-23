package com.kt.sfgpetclinicj8.services.map;

import com.kt.sfgpetclinicj8.model.Speciality;
import com.kt.sfgpetclinicj8.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by kontelk on 8/23/23.
 */
@Service
public class SpecialtyMapService
        extends AbstractMapService<Speciality, Long>
        implements SpecialtyService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}