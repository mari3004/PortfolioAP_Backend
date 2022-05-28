
package com.ar.maribelaizpitarte.backend.controller;

import java.util.List;
import java.util.Optional;
        
public interface Dao<T> {
    Optional<T> get(int id);
    List<T> getAll();
    boolean save(T t);
    void delete(T t);
}