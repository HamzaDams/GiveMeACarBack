package fr.givemeacar.givemecar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicule_id")
    private Long id;

    private String modele;

    private String marque;

    private String couleur;

    private String immat;

    private int nivCarburant;

    private int kilometrage;

    private String localisation;//lat, long(45.1, -1.5)

    public Vehicule() {

    }
}
