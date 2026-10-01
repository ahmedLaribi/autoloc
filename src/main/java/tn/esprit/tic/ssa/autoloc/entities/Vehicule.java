package tn.esprit.tic.ssa.autoloc.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.tic.ssa.autoloc.entities.enums.CategorieVehicule;
import tn.esprit.tic.ssa.autoloc.entities.enums.StatutVehicule;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idVehicule;
    String immatriculation;
    String marque;
    String modele;

    @Enumerated(EnumType.STRING)
    CategorieVehicule categorie;

    BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    StatutVehicule statut;
}