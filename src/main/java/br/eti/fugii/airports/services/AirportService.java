
package br.eti.fugii.airports.services;

import br.eti.fugii.airports.entities.Airport;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.eti.fugii.airports.repositories.AirportRepository;


@Service
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    public List<Airport> findAll() {

        List<Airport> result = airportRepository.findAll();
        
        return result;
    }

 public List<Airport> findByCity(String city) {
        List<Airport> result = airportRepository.findByCityIgnoreCase(city);
        return result;
    }
}
