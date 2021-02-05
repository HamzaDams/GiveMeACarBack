package fr.givemeacar.givemecar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class LocationVehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long id;

    private Date debutDateHoraireLocation;
    private Date finDateHoraraireLocation;

    private String debutLocalisationGps;
    private String finLocalisationGps;

    @OneToOne
    private Vehicule vehiculeId;
}
