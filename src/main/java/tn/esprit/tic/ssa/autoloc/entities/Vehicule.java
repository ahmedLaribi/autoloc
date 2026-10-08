package tn.esprit.tic.ssa.autoloc.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import tn.esprit.tic.ssa.autoloc.entities.enums.CategorieVehicule;
import tn.esprit.tic.ssa.autoloc.entities.enums.StatutVehicule;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicule {

    @ManyToOne
    @JoinColumn(name = "agence_id")
    Agence agence;

    @ManyToMany
    @JoinTable(
            name = "vehicule_equipement",
            joinColumns = @JoinColumn(name = "vehicule_id"),
            inverseJoinColumns = @JoinColumn(name = "equipement_id")
    )
    Set<Equipement> equipements = new HashSet<>();

    @OneToMany(mappedBy = "vehicule")
    @JsonIgnore
    List<Maintenance> maintenances = new ArrayList<>();

    @OneToMany(mappedBy = "vehicule")
    @JsonIgnore
    List<Reservation> reservations = new ArrayList<>();


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