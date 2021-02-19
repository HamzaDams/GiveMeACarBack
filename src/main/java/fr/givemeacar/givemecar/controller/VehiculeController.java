package fr.givemeacar.givemecar.controller;

import fr.givemeacar.givemecar.model.Vehicule;
import fr.givemeacar.givemecar.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/vehicules/*")
public class VehiculeController {

    @Autowired
    private VehiculeService vehiculeService;

    @GetMapping("/list")
    public List<Vehicule> getAllVehicule(){
        return vehiculeService.getAllVehicule();
    }
}
