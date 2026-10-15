package tn.esprit.tic.ssa.autoloc.service;

import tn.esprit.tic.ssa.autoloc.entities.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement paiement);
    Paiement modifierPaiement(Paiement paiement);
    List<Paiement> consulterPaiements();
    Paiement consulterPaiementById(Long idPaiement);
    void supprimerPaiementById(Long idPaiement);
}
