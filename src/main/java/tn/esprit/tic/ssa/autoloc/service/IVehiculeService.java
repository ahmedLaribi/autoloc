package tn.esprit.tic.ssa.autoloc.service;

import tn.esprit.tic.ssa.autoloc.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule(Vehicule vehicule);
    Vehicule modifierVehicule(Vehicule vehicule);
    List<Vehicule> consulterVehicules();
    Vehicule consulterVehiculeById(Long idVehicule);
    void supprimerVehiculeById(Long idVehicule);
}
