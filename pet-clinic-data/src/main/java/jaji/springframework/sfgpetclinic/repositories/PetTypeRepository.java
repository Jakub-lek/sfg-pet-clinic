package jaji.springframework.sfgpetclinic.repositories;

import jaji.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Jakub Jílek on 03.03.2020
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
