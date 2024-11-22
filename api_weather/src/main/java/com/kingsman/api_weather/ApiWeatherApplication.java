package com.kingsman.api_weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ApiWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiWeatherApplication.class, args);
	}

}
