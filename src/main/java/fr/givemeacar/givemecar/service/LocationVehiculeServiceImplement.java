package fr.givemeacar.givemecar.service;

import fr.givemeacar.givemecar.model.LocationVehicule;
import fr.givemeacar.givemecar.repo.LocationVehiculeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationVehiculeServiceImplement implements LocationVehiculeService {

    @Autowired
    private LocationVehiculeRepo locationVehiculeRepo;

    @Override
    public LocationVehicule ajoutLocation(LocationVehicule locationVehicule) {
        return locationVehiculeRepo.save(locationVehicule);
    }

    @Override
    public Optional<LocationVehicule> getLocation(Long id) {
        return locationVehiculeRepo.findById(id);
    }
}
