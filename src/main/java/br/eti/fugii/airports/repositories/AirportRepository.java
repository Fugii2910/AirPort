
package br.eti.fugii.airports.repositories;

import br.eti.fugii.airports.entities.Airport;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AirportRepository extends JpaRepository<Airport, Long> {
 
    List<Airport> findByCityIgnoreCase(String city);
    List<Airport> findByCountryIgnoreCase(String country);
 
    
    Airport findByIataCode(String iataCode);
    
}
