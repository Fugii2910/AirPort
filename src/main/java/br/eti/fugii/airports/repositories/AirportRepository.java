
package br.eti.fugii.airports.repositories;

import br.eti.fugii.airports.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AirportRepository extends JpaRepository<Airport, Long> {
    
}
