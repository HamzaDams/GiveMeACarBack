package fr.givemeacar.givemecar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String prenom;

    private String nom;

    private String adresse;

    private String motDePasse;

    @OneToOne
    private CarteBancaire carteBancaire;

    @OneToOne
    private Forfait forfait;

}
