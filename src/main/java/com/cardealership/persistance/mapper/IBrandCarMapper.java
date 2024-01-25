package com.cardealership.persistance.mapper;

import com.cardealership.domain.pojos.BrandCarPojo;
import com.cardealership.persistance.entity.BrandCarEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 *  Mapper que transforma objetos de marca carro a pojos o entidades
 */
@Mapper(componentModel = "spring")
public interface IBrandCarMapper {

    /**
     * Convierte una entidad a un pojo de marca carro
     * @param brandEntity Entidad a convertir
     * @return Pojo convertido
     */
        @Mapping(source = "id", target = "id")
        @Mapping(source = "description", target = "description")
        BrandCarPojo toBrandCarEntity(BrandCarEntity brandEntity);

    /**
     * Convierte un pojo a una entidad de marca carro
     * @param brandPojo Pojo a convertir
     * @return Entidad convertida
     */
    @InheritInverseConfiguration
        BrandCarEntity toBrandCarPojo(BrandCarPojo brandPojo);
}
