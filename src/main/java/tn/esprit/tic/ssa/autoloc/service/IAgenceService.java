package tn.esprit.tic.ssa.autoloc.service;

import tn.esprit.tic.ssa.autoloc.entities.Agence;

import java.util.List;

public interface IAgenceService {
    Agence ajouterAgence(Agence agence);
    Agence modifierAgence(Agence agence);
    List<Agence> consulterAgences();
    Agence consulterAgenceById(Long idAgence);
    void supprimerAgenceById(Long idAgence);
}
