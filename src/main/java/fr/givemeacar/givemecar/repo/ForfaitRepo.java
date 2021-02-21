package fr.givemeacar.givemecar.repo;

import fr.givemeacar.givemecar.model.Forfait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ForfaitRepo extends JpaRepository<Forfait, Long> {

    List<Forfait> findForfaitByNom(String nom);

}
