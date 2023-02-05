package com.utdweather.weatherapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitiesService {
    @Autowired
    private CitiesRepository citiesRepository;

    public List<Cities> allCities() {
        return citiesRepository.findAll();
    }
}
