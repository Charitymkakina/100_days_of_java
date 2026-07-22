package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class WeatherContoller {

   private final RestClient restClient;

   public WeatherContoller(RestClient restClient){
    this.restClient = restClient;
   }
   @GetMapping("/weather")
   public String getWeather(){
    String response = restClient.get()
                .uri("https://api.open-meteo.com/v1/forecast?latitude=-1.286389&longitude=36.817223&current=temperature_2m")
                .retrieve()
                .body(String.class);

       return response;         
   }
}
