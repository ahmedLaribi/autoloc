package tn.esprit.tic.ssa.autoloc.entities;

import jakarta.persistence.*;
import lombok.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor



public class Agence {


    @OneToMany(mappedBy = "agence")
    @JsonIgnore
    List<Employe> employes = new ArrayList<>();

    @OneToMany(mappedBy = "agence")
    @JsonIgnore
    List<Vehicule> vehicules = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idAgence;
    String nom;
    String ville;
    String adresse;
    String telephone;
}