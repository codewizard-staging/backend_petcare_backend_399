package com.app.petcare_backend.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.petcare_backend.model.Pet;
import com.app.petcare_backend.model.PetCareCenter;
import com.app.petcare_backend.model.PetOwner;
import com.app.petcare_backend.model.Document;
import com.app.petcare_backend.model.PetService;
import com.app.petcare_backend.enums.PetServiceType;
import com.app.petcare_backend.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterBusinessHours")
@Table(schema = "\"petcare_backend\"", name = "\"PetCareCenterBusinessHours\"")
@Data
public class PetCareCenterBusinessHours{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"BusinessHours\"")
    private Integer businessHours;
}