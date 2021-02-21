package fr.givemeacar.givemecar.service;

import fr.givemeacar.givemecar.model.CarteBancaire;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarteBancaireService {

    CarteBancaire ajouterCarteBancaire(CarteBancaire carteBancaire);



}
