package com.example.geolocation.controller;

import com.example.geolocation.model.City;
import com.example.geolocation.service.GeoLocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GeolocationController {
    private final GeoLocationService service;

    @GetMapping("/cities")
    public List<City> getAllCities(@RequestParam String query) {
        return service.getCityByName(query);
    }

    @GetMapping("/cities/{id}")
    public City getCityById(@PathVariable long id) {
        return service.getCityById(id);
    }
}
