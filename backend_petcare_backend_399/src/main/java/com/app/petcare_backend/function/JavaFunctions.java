package com.app.petcare_backend.function;

import com.app.petcare_backend.model.Pet;
import com.app.petcare_backend.model.PetCareCenter;
import com.app.petcare_backend.model.PetOwner;
import com.app.petcare_backend.model.Document;
import com.app.petcare_backend.model.PetService;
import com.app.petcare_backend.enums.PetServiceType;
import com.app.petcare_backend.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.petcare_backend.repository.PetServiceRepository;
import com.app.petcare_backend.repository.PetOwnerRepository;
import com.app.petcare_backend.repository.PetCareCenterRepository;
import com.app.petcare_backend.repository.DocumentRepository;
import com.app.petcare_backend.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
