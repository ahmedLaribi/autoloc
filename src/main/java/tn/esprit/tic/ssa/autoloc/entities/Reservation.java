package tn.esprit.tic.ssa.autoloc.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import tn.esprit.tic.ssa.autoloc.entities.enums.StatutReservation;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @ManyToOne
    @JoinColumn(name = "vehicule_id")
    Vehicule vehicule;

    @ManyToOne
    @JoinColumn(name = "client_id")
    Client client;

    @OneToOne(mappedBy = "reservation")
    @JsonIgnore
    Contrat contrat;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idReservation;
    LocalDate dateDebut;
    LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    StatutReservation statut;
}