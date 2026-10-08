package tn.esprit.tic.ssa.autoloc.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Maintenance {

    @ManyToOne
    @JoinColumn(name = "vehicule_id")
    Vehicule vehicule;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idMaintenance;
    LocalDate dateDebut;
    LocalDate dateFin;
    String description;
}