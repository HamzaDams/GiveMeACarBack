package fr.givemeacar.givemecar.service;

import fr.givemeacar.givemecar.model.Agence;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AgenceService {
    Agence createAgence(Agence agence);

}
