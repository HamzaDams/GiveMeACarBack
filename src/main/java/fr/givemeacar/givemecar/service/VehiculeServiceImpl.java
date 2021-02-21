package fr.givemeacar.givemecar.service;

import fr.givemeacar.givemecar.dto.VehiculeDTO;
import fr.givemeacar.givemecar.model.Vehicule;
import fr.givemeacar.givemecar.repo.VehiculeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeServiceImpl implements VehiculeService{

    @Autowired
    private VehiculeRepo vehiculeRepo;

    @Override
    public List<Vehicule> getAllVehicule() {
        return vehiculeRepo.findAll();
    }

    public Optional<Vehicule> getInfoVehicule(Long id) {

        Optional<Vehicule> vehiculeFound = vehiculeRepo.findById(id);

        return vehiculeFound;
    }
}
