package fr.givemeacar.givemecar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LocationVehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long id;

    private Date debutDateHoraireLocation;
    private Date finDateHoraireLocation;

    private String debutLocalisationGps;
    private String finLocalisationGps;

    @OneToOne
    private Vehicule vehiculeId;

}
