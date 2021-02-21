package fr.givemeacar.givemecar.service;

import fr.givemeacar.givemecar.dto.VehiculeDTO;
import fr.givemeacar.givemecar.model.Vehicule;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface VehiculeService {

    /**
     * @return List<Vehicule>
     */
    List<Vehicule> getAllVehicule();

    Optional<Vehicule> getInfoVehicule(Long id);

}
