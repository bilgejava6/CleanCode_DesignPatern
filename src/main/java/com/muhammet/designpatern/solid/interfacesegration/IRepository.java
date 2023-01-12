package com.muhammet.designpatern.solid.interfacesegration;

import java.util.List;
import java.util.Optional;

public interface IRepository {
    void save(Object entity);
    void update(Object entity);
    void delete(Object entity);
    List<Object> findAll();
    Optional<Object> findOptionalById(Long id);
}
