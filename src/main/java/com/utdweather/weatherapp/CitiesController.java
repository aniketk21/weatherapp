package com.utdweather.weatherapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cities")
public class CitiesController {
    @Autowired
    private CitiesService citiesService;

    @GetMapping
    public ResponseEntity<List<Cities>> allCities() {
        return new ResponseEntity<List<Cities>>(citiesService.allCities(), HttpStatus.OK);
    }
}
