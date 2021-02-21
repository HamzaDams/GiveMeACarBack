package fr.givemeacar.givemecar.service;

import fr.givemeacar.givemecar.model.LocationVehicule;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface LocationVehiculeService {
    LocationVehicule ajoutLocation(LocationVehicule locationVehicule);
    Optional<LocationVehicule> getLocation(Long id);
}
