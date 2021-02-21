package fr.givemeacar.givemecar.controller;

import fr.givemeacar.givemecar.model.LocationVehicule;
import fr.givemeacar.givemecar.repo.LocationVehiculeRepo;
import fr.givemeacar.givemecar.repo.VehiculeRepo;
import fr.givemeacar.givemecar.service.LocationVehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin("*")
public class LocationVehiculeController {
    @Autowired
    private LocationVehiculeService locationVehiculeService;

    @PostMapping("/ajouterLocation")
    @ResponseBody
    public ResponseEntity<?> createLocation(@RequestBody LocationVehicule locationVehicule) {
        locationVehiculeService.ajoutLocation(locationVehicule);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/getLocation/{id}")
    @ResponseBody
    public ResponseEntity<?> getLocation(@PathVariable(value = "id") Long id){
        locationVehiculeService.getLocation(id);
        return new ResponseEntity<>(HttpStatus.GONE);
    }
}
