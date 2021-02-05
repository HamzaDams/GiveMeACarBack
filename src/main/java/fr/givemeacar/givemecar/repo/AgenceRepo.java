package fr.givemeacar.givemecar.repo;

import fr.givemeacar.givemecar.model.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AgenceRepo extends JpaRepository<Agence, Long> {

}
