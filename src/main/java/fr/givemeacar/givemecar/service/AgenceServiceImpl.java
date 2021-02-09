package fr.givemeacar.givemecar.service;

import fr.givemeacar.givemecar.model.Agence;
import fr.givemeacar.givemecar.model.Client;
import fr.givemeacar.givemecar.model.Contrat;
import fr.givemeacar.givemecar.model.Vehicule;
import fr.givemeacar.givemecar.repo.AgenceRepo;
import fr.givemeacar.givemecar.repo.VehiculeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgenceServiceImpl implements AgenceService{

   @Autowired
    private AgenceRepo agenceRepo;

   @Autowired
   private VehiculeRepo vehiculeRepo;


    @Override
    public Agence createAgence(Agence agence) {
        return agenceRepo.save(agence);
    }

    @Override
    public Vehicule ajoutVehicule(Vehicule vehicule) {
        Vehicule vehiculeAjouter = vehiculeRepo.save(vehicule);
        return vehiculeAjouter;
    }

    @Override
    public void deleteVehicule(Long vehiculeId) {
        vehiculeRepo.deleteById(vehiculeId);
    }

    @Override
    public Contrat faireUnContrat(Client clientId, int tarif, Vehicule vehiculeId) {
        return null;
    }
}
