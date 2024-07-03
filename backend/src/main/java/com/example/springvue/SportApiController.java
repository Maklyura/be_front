package com.example.springvue;

//import ai.vbrl.be.games.service.SportApiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SportApiController {

    @Value("${spring.data.rest.basePath}")
    String basePath;

    //private final SportApiService sportApiService;

    //public SportApiController(SportApiService sportApiService) {
        //this.sportApiService = sportApiService;
    //}

    /*@GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }*/

    /*@GetMapping("/health")
    public String health() {
        return "UP";
    }*/
}
