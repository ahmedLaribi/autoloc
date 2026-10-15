package tn.esprit.tic.ssa.autoloc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.ssa.autoloc.entities.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {
}
