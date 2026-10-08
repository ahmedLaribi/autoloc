package tn.esprit.tic.ssa.autoloc.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.tic.ssa.autoloc.entities.enums.Role;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employe {


    @ManyToOne
    @JoinColumn(name = "agence_id")
    Agence agence;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEmploye;
    String nom;
    String prenom;


    @Enumerated(EnumType.STRING)
    Role role;

}


