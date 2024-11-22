package com.kingsman.api_weather.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.kingsman.api_weather.Services.ClimaServices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping("/city")
public class ClimaController {

    @Autowired
    private ClimaServices climaServices;

    @GetMapping(value = "/weather")
    public ResponseEntity<String> getWeatherController(@RequestParam  String city){

        System.out.println("entreeeeeee y la cuidad es " + city);
        return climaServices.getClimate(city);

    }
    
}
