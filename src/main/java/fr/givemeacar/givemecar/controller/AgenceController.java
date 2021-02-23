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
@RequestMapping(value = "/agence")
public class AgenceController {

    @Autowired
    private AgenceService agenceService;

    @PostMapping("/ajouterAgence")
    public ResponseEntity<?> createAgence(@RequestBody Agence agence) throws BusinessResourceException {
        return new ResponseEntity<>(agenceService.createAgence(agence),HttpStatus.CREATED);
    }

    @PostMapping("/ajouterVehicule")
    public ResponseEntity<?> ajoutVehicule(@RequestBody Vehicule vehicule) {
        return new ResponseEntity<>(agenceService.ajoutVehicule(vehicule),HttpStatus.CREATED);//201
    }

    @GetMapping("/supprimerVehicule/{id}")
    public ResponseEntity<?> supprimerVehicule(@PathVariable(value = "id") Long id){
        agenceService.deleteVehicule(id);
        return new ResponseEntity<>(HttpStatus.GONE);
    }

}
