package com.kt.sfgpetclinicj8.services.map;

import com.kt.sfgpetclinicj8.model.Vet;
import com.kt.sfgpetclinicj8.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by kontelk on 8/19/23.
 */
@Service
public class VetServiceMap
        extends AbstractMapService<Vet, Long>
        implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
