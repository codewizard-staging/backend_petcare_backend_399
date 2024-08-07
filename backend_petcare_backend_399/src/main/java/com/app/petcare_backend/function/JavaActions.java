package com.app.petcare_backend.function;

import com.app.petcare_backend.model.Pet;
import com.app.petcare_backend.model.PetCareCenter;
import com.app.petcare_backend.model.PetOwner;
import com.app.petcare_backend.model.Document;
import com.app.petcare_backend.model.PetService;




import com.app.petcare_backend.enums.PetServiceType;
import com.app.petcare_backend.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  