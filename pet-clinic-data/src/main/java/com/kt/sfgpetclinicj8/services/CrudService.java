package com.kt.sfgpetclinicj8.services;

import java.util.Set;

/**
 * Created by kontelk on 8/18/23.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
