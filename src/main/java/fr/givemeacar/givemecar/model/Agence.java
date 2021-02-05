package fr.givemeacar.givemecar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "Agence")
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isSiege = false;

    private String ville;

    private String adresse;

    private String administrateur;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "agence_list_contrat",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "contrat_id")
    )
    private List<Contrat> listContrat;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "list_vehicule_agence",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "vehicule_id")
    )
    private List<Vehicule> listVehicule;

    public Agence() {

    }
}
