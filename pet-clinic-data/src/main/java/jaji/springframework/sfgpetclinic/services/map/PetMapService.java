package jaji.springframework.sfgpetclinic.services.map;

import jaji.springframework.sfgpetclinic.model.Pet;
import jaji.springframework.sfgpetclinic.services.PetService;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deletById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
