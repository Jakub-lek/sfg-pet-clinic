package jaji.springframework.sfgpetclinic.repositories;

import jaji.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Jakub Jílek on 03.03.2020
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
