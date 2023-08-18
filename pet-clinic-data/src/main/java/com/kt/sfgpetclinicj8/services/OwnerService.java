package com.kt.sfgpetclinicj8.services;


import com.kt.sfgpetclinicj8.model.Owner;

/**
 * Created by kontelk on 8/17/23.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
