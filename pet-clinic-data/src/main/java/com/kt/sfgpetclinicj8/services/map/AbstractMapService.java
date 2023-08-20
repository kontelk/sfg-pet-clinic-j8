package com.kt.sfgpetclinicj8.services.map;

import com.kt.sfgpetclinicj8.model.BaseEntity;

import java.util.*;

/**
 * Created by kontelk on 8/18/23.
 */
public abstract class AbstractMapService<
        T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }
        else {
            throw new RuntimeException("ERROR: Can not save a null Object");
        }
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    /**
     * Helper method to get the next long number
     * to assign it on id when we save a new object.
     */
    private Long getNextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet())+1;
        }
        catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
        // ---------other way to do this------------- //
        // if (map.size()==0)
        //    return 1L;
        // else
        //    return Collections.max(map.keySet())+1;
        // ----------------------------------------- //
    }
}