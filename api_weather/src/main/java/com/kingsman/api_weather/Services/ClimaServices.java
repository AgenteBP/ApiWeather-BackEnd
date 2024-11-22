package com.kingsman.api_weather.Services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class ClimaServices {
    
    String apiKey = "15eb4da7eca7c554c9096899ea5c40c3";

    public ResponseEntity<String> getClimate(String city){
        
        String apiKey = "15eb4da7eca7c554c9096899ea5c40c3";
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&lang=es&units=metric";
        try {

            RestTemplate restTemplate = new RestTemplate();
            String weather = restTemplate.getForObject(url, String.class);
            
            return ResponseEntity.ok(weather);
        } catch (HttpClientErrorException.Unauthorized e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Error al autenticarse");
        }
    }
}
