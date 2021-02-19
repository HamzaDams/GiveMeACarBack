package fr.givemeacar.givemecar.service;

import fr.givemeacar.givemecar.model.Vehicule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VehiculeService {

    /*
    @return List<Vehicule>
    Récupere la list des véhicule
     */
    List<Vehicule> getAllVehicule();

}
