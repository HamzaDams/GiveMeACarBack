package fr.givemeacar.givemecar.dto;

import fr.givemeacar.givemecar.model.Agence;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class VehiculeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String modele;

    private String marque;

    private String couleur;

    private String immat;

    private int nivCarburant;

    private int kilometrage;

    private String localisation;//lat, long(45.1, -1.5)

    private Agence agence;

}
