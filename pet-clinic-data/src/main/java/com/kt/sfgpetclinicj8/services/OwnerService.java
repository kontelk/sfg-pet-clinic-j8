package com.kt.sfgpetclinicj8.services;


import com.kt.sfgpetclinicj8.model.Owner;

import java.util.Set;

/**
 * Created by kontelk on 8/17/23.
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
