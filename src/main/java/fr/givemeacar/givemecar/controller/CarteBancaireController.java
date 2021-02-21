package fr.givemeacar.givemecar.controller;


import fr.givemeacar.givemecar.model.CarteBancaire;
import fr.givemeacar.givemecar.service.CarteBancaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class CarteBancaireController {

    @Autowired
    private CarteBancaireService carteBancaireService;

    @PostMapping("/ajouterCarteBancaire")
    @ResponseBody
        public String addCarteBancaire(@RequestBody CarteBancaire carteBancaire){
        carteBancaireService.ajouterCarteBancaire(carteBancaire);
        return "lala";
    }


}
