package fr.givemeacar.givemecar.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "ClientGivemeacar")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long id;

    private String prenom;

    private String nom;

    private String adresse;

    private String motDePasse;

    @OneToOne
    private CarteBancaire carteBancaire;

    @OneToOne
    private Forfait forfait;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "list_location",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "location_id")
    )
    private List<LocationVehicule> listLocation;

}
