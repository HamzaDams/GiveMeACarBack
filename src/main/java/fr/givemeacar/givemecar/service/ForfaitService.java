package fr.givemeacar.givemecar.service;

import fr.givemeacar.givemecar.model.Forfait;
import org.springframework.stereotype.Service;

@Service
public interface ForfaitService {
    Forfait creerForfait(Forfait forfait);
}
