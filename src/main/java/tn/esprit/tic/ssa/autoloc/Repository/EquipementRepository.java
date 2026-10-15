package tn.esprit.tic.ssa.autoloc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.ssa.autoloc.entities.Equipement;

@Repository
public interface EquipementRepository extends JpaRepository<Equipement, Long> {
}
