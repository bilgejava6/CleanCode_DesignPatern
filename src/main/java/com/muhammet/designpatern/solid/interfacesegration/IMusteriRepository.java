package com.muhammet.designpatern.solid.interfacesegration;

import java.util.List;

public interface IMusteriRepository extends IRepository{

    List<Object> findByMusteriNumber(Long mNumber);
}
