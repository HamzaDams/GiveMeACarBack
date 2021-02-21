package fr.givemeacar.givemecar.service;

import fr.givemeacar.givemecar.model.Forfait;
import fr.givemeacar.givemecar.repo.ForfaitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForfaitServiceImpl implements ForfaitService{

    @Autowired
    private ForfaitRepo forfaitRepo;
    @Override
    public Forfait creerForfait(Forfait forfait) {
        Forfait forfaitCreer = forfaitRepo.save(forfait);
        return forfaitCreer;
    }
}
