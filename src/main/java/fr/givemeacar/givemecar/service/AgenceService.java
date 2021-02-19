package fr.givemeacar.givemecar.service;

import fr.givemeacar.givemecar.model.Agence;
import fr.givemeacar.givemecar.model.Client;
import fr.givemeacar.givemecar.model.Contrat;
import fr.givemeacar.givemecar.model.Vehicule;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AgenceService {

    /*
    @param  Agence
    @return  Agence
    Permet l'ajout d'un agence avec en parametre une agence
     */
    Agence createAgence(Agence agence);

    /*
    @param Vehicule
    @return Vehicule
    Permet l'ajout d'un véhicule avec en parametre un véhicule
     */
    Vehicule ajoutVehicule(Vehicule vehicule);

    /*
    @param : Long vehiculeId
    @return void
    Suppression d'un véhicule avec en parametre l'id du Véhicule
     */
    void deleteVehicule(Long vehiculeId);

    /*
     @param Client clientId, int tarif, Vehicule vehiculeId
     @return Contrat
     Etabli un contrat entre l
    */
    Contrat faireUnContrat(Client clientId, int tarif, Vehicule vehiculeId, Agence agenceId);

}
