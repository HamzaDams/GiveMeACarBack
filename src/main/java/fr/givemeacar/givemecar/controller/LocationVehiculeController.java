package fr.givemeacar.givemecar.controller;

import fr.givemeacar.givemecar.model.LocationVehicule;
import fr.givemeacar.givemecar.model.Vehicule;
import fr.givemeacar.givemecar.repo.LocationVehiculeRepo;
import fr.givemeacar.givemecar.repo.VehiculeRepo;
import fr.givemeacar.givemecar.service.LocationVehiculeService;
import fr.givemeacar.givemecar.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class LocationVehiculeController {

    @Autowired
    private LocationVehiculeService locationVehiculeService;

    @Autowired
    private VehiculeService vehiculeService;

    @Autowired
    private VehiculeRepo vehiculeRepo;

    @PostMapping("/ajouterLocation")
    @ResponseBody
    public ResponseEntity<?> createLocation(@RequestBody LocationVehicule locationVehicule) {


        Optional<Vehicule> vehiculeTrouver = vehiculeService.getInfoVehicule(locationVehicule.getVehiculeId().getId());

        try{
            if (!vehiculeTrouver.get().getEtat()){
                locationVehiculeService.ajoutLocation(locationVehicule);
                vehiculeRepo.updateEtat(true, locationVehicule.getId());
                return new ResponseEntity<>(HttpStatus.CREATED);
            }else{
                return new ResponseEntity<>("Le véhicule n'est pas disponible a la location", HttpStatus.CONFLICT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Erreur" + e,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/finLocation/{id}")
    @ResponseBody
    public ResponseEntity<?> finLocation(@PathVariable(value = "id") Long id) {
           vehiculeRepo.updateEtat(false, id);
           return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/getLocation/{id}")
    @ResponseBody
    public ResponseEntity<?> getLocation(@PathVariable(value = "id") Long id){
        locationVehiculeService.getLocation(id);
        return new ResponseEntity<>(HttpStatus.GONE);
    }
}
