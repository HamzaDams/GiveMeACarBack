package fr.givemeacar.givemecar.controller;

import fr.givemeacar.givemecar.exception.BusinessResourceException;
import fr.givemeacar.givemecar.model.Agence;
import fr.givemeacar.givemecar.model.Vehicule;
import fr.givemeacar.givemecar.service.AgenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class AgenceController {

    @Autowired
    private AgenceService agenceService;

    @PostMapping("/ajouterAgence")
    @ResponseBody
    public ResponseEntity<?> createAgence(@RequestBody Agence agence) throws BusinessResourceException {
        agenceService.createAgence(agence);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/ajouterVehicule")
    @ResponseBody
    public ResponseEntity<?> ajoutVehicule(@RequestBody Vehicule vehicule) {
        agenceService.ajoutVehicule(vehicule);
        return new ResponseEntity<>(HttpStatus.CREATED);//201
    }

    @GetMapping("/supprimerVehicule/{id}")
    public ResponseEntity<?> supprimerVehicule(@PathVariable(value = "id") Long id){
        agenceService.deleteVehicule(id);
        return new ResponseEntity<>(HttpStatus.GONE);
    }

}
