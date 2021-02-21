package fr.givemeacar.givemecar.repo;

import fr.givemeacar.givemecar.model.CarteBancaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarteBancaireRepo extends JpaRepository<CarteBancaire, Long> {
    //jpa propose dèjà des methodes

}
