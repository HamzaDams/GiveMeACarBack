package fr.givemeacar.givemecar.service;

import fr.givemeacar.givemecar.exception.BusinessResourceException;
import fr.givemeacar.givemecar.model.Agence;
import fr.givemeacar.givemecar.model.Client;
import fr.givemeacar.givemecar.model.Contrat;
import fr.givemeacar.givemecar.model.Vehicule;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AgenceService {

    /**
     * Permet l'ajout d'un agence avec en parametre une agence
     * @param agence
     * @return Agence
     */
    Agence createAgence(Agence agence) throws BusinessResourceException;

    /**
     * Permet l'ajout d'un véhicule avec en parametre un véhicule
     * @param vehicule
     * @return Vehicule
     */
    Vehicule ajoutVehicule(Vehicule vehicule);

    /**
     * Suppression d'un véhicule avec en parametre l'id du Véhicule
     * @param vehiculeId
     * @return void
     */
    void deleteVehicule(Long vehiculeId);

    /**
     *
     * @param clientId
     * @param tarif
     * @param vehiculeId
     * @param agenceId
     * @return Contrat
     */
    Contrat faireUnContrat(Client clientId, int tarif, Vehicule vehiculeId, Agence agenceId);

}
