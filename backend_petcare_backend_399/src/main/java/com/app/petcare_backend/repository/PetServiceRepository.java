package com.app.petcare_backend.repository;

import com.app.petcare_backend.model.PetService;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PetServiceRepository extends SimpleJpaRepository<PetService, String> {
    private final EntityManager em;
    public PetServiceRepository(EntityManager em) {
        super(PetService.class, em);
        this.em = em;
    }
    @Override
    public List<PetService> findAll() {
        return em.createNativeQuery("Select * from \"petcare_backend\".\"PetService\"", PetService.class).getResultList();
    }
}