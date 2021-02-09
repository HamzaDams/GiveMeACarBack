package fr.givemeacar.givemecar.service;

import fr.givemeacar.givemecar.model.Agence;
import fr.givemeacar.givemecar.model.Client;
import fr.givemeacar.givemecar.model.Contrat;
import fr.givemeacar.givemecar.model.Vehicule;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AgenceService {
    Agence createAgence(Agence agence);
    Vehicule ajoutVehicule(Vehicule vehicule);
    void deleteVehicule(Long vehiculeId);
    Contrat faireUnContrat(Client clientId, int tarif, Vehicule vehiculeId);

}
