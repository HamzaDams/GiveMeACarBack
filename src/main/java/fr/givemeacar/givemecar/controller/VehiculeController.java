package fr.givemeacar.givemecar.controller;

import fr.givemeacar.givemecar.dto.VehiculeDTO;
import fr.givemeacar.givemecar.model.Vehicule;
import fr.givemeacar.givemecar.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/vehicule/*")
public class VehiculeController {

    @Autowired
    private VehiculeService vehiculeService;

    @GetMapping("/list")
    public List<Vehicule> getAllVehicule(){
        return vehiculeService.getAllVehicule();
    }

    @GetMapping("/{id}")
    public Optional<Vehicule> getInfoVehicule(@PathVariable(value = "id") Long id) {
        return vehiculeService.getInfoVehicule(id);
    }
}
