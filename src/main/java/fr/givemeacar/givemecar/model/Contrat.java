package fr.givemeacar.givemecar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contrat_id")
    private Long id;

    private Date date;

    private int tarfication;

    private String carteBancaireId;

    @OneToOne
    private Client client;

}
