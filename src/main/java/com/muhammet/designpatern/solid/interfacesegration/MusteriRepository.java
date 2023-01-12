package com.muhammet.designpatern.solid.interfacesegration;

import java.util.List;
import java.util.Optional;

public class MusteriRepository implements IMusteriRepository{
    @Override
    public void save(Object entity) {

    }

    @Override
    public void update(Object entity) {

    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public List<Object> findAll() {
        return null;
    }

    @Override
    public Optional<Object> findOptionalById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Object> findByMusteriNumber(Long mNumber) {
        return null;
    }
}
