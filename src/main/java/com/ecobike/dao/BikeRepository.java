package com.ecobike.dao;

import com.ecobike.model.Bike;
import com.ecobike.model.BikeQuery;

import java.util.List;

public interface BikeRepository {

    List<Bike> getAll();

    void add(Bike bike);

    void saveAll() throws Exception;

    boolean hasUnsaved();

    Bike find(BikeQuery bikeQuery);
}
