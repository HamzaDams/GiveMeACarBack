package fr.givemeacar.givemecar.repo;
import fr.givemeacar.givemecar.model.LocationVehicule;
import fr.givemeacar.givemecar.model.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationVehiculeRepo extends JpaRepository<LocationVehicule, Long>{

}
