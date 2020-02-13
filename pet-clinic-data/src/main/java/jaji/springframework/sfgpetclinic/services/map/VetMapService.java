package jaji.springframework.sfgpetclinic.services.map;

import jaji.springframework.sfgpetclinic.model.Vet;
import jaji.springframework.sfgpetclinic.services.VetService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deletById(id);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
