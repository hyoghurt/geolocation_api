package com.example.geolocation.repository;

import com.example.geolocation.model.City;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CityRepository extends MongoRepository<City, Long> {

    List<City> findCityByNameRuRegexOrNameEnRegexOrderByNameRu(String nameRu, String nameEn);
}
