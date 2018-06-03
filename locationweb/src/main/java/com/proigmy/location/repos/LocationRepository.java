package com.proigmy.location.repos;

import org.springframework.data.repository.CrudRepository;

import com.proigmy.location.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
