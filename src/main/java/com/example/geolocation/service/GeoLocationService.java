package com.example.geolocation.service;

import com.example.geolocation.exception.NotFoundException;
import com.example.geolocation.model.City;
import com.example.geolocation.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GeoLocationService {
    private final CityRepository cityRepository;

    public List<City> getCityByName(String name) {
        String name1 = "(?i)^%s.*".formatted(name);
        return cityRepository.findCityByNameRuRegexOrNameEnRegexOrderByNameRu(name1, name1);
    }

    public City getCityById(long id) {
        return cityRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("not found id " + id));
    }
}
