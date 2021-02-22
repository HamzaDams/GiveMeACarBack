package fr.givemeacar.givemecar.repo;

import fr.givemeacar.givemecar.model.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface VehiculeRepo extends JpaRepository<Vehicule, Long> {

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("UPDATE Vehicule v SET v.etat = ?1 WHERE v.id = ?2")
    void updateEtat(Boolean etat, long id);

}
