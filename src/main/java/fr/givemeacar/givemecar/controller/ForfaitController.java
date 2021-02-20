package fr.givemeacar.givemecar.controller;

import fr.givemeacar.givemecar.model.Forfait;
import fr.givemeacar.givemecar.service.ForfaitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class ForfaitController {

    @Autowired
    private ForfaitService forfaitService;

    @PostMapping("/creerForfait")
    @ResponseBody
    public String addForfait(@RequestBody Forfait forfait) {
        forfaitService.creerForfait(forfait);
        return "ok";
    }

}
