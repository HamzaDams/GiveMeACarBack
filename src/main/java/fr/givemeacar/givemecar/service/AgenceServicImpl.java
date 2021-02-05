package fr.givemeacar.givemecar.service;

import fr.givemeacar.givemecar.model.Agence;
import fr.givemeacar.givemecar.repo.AgenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgenceServicImpl implements AgenceService{

    @Autowired
    private AgenceRepo agenceRepo;

    @Override
    public Agence createAgence(Agence agence) {

        return agenceRepo.save(agence);
    }

}
