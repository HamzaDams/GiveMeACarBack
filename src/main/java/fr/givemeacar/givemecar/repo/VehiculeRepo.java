package fr.givemeacar.givemecar.repo;

import fr.givemeacar.givemecar.model.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeRepo extends JpaRepository<Vehicule, Long> {
}
