package com.app.petcare_backend.converter;

import com.app.petcare_backend.enums.PetServiceType;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class PetServiceTypeConverter implements AttributeConverter<PetServiceType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(PetServiceType petServiceType) {
        return petServiceType != null ? petServiceType.ordinal() : null;
    }

    @Override
    public PetServiceType convertToEntityAttribute(Integer dbData) {
      if (dbData == null) {
        return null;
      }
		  return PetServiceType.getPetServiceType(dbData);
    }
}
