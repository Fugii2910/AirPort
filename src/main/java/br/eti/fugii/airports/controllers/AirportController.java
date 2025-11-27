package br.eti.fugii.airports.controllers;

import br.eti.fugii.airports.entities.Airport;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.eti.fugii.airports.services.AirportService;

@RestController
public class AirportController {
    
    @Autowired
    private AirportService airportService;
    
    /*
    *endpoint / airports / airport
    *Retorna TODOS os aeroportos da base de dados
    *@Return
    */
    
    @GetMapping("/airport")
    public List<Airport> findAll() {
        List<Airport> result = airportService.findAll();
        return result;
    }
}
