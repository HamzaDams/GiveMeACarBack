package fr.givemeacar.givemecar.service;

import fr.givemeacar.givemecar.model.CarteBancaire;
import fr.givemeacar.givemecar.repo.CarteBancaireRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarteBancaireServiceImpl implements CarteBancaireService{
    @Autowired
    private CarteBancaireRepo carteBancaireRepo;

    @Override
    public CarteBancaire ajouterCarteBancaire(CarteBancaire carteBancaire) {

        CarteBancaire ajouterCarte = carteBancaireRepo.save(carteBancaire);
        return ajouterCarte;
    }
}
