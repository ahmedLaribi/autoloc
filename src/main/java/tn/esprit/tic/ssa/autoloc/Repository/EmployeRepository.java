package tn.esprit.tic.ssa.autoloc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.ssa.autoloc.entities.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
