package fr.givemeacar.givemecar.service;

import fr.givemeacar.givemecar.exception.BusinessResourceException;
import fr.givemeacar.givemecar.model.Agence;
import fr.givemeacar.givemecar.model.Client;
import fr.givemeacar.givemecar.model.Contrat;
import fr.givemeacar.givemecar.model.Vehicule;
import fr.givemeacar.givemecar.repo.AgenceRepo;
import fr.givemeacar.givemecar.repo.VehiculeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class AgenceServiceImpl implements AgenceService{

   @Autowired
    private AgenceRepo agenceRepo;

   @Autowired
   private VehiculeRepo vehiculeRepo;

    @Override
    public Agence createAgence(Agence agence) throws BusinessResourceException {
        try {
            Agence result = agenceRepo.save(agence);
            return result;
        }catch (DataIntegrityViolationException e) {
            throw new BusinessResourceException("DuplicateValueError", "Une agence existe deja avec les memes informations"+ agence.getAdresse(), HttpStatus.CONFLICT);
        }catch (Exception e) {
            throw new BusinessResourceException("SaveAgence", "Erreur technique lors de la création", HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
    public Contrat faireUnContrat(Client clientId, int tarif, Vehicule vehiculeId, Agence agenceId) {
        return null;
    }
}
