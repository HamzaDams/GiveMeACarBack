package fr.givemeacar.givemecar.controller;

import fr.givemeacar.givemecar.model.Agence;
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
    public ResponseEntity<?> createAgence(@RequestBody Agence agence) {
        agenceService.createAgence(agence);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
