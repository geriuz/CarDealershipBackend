package com.cardealership.persistance.mappers;

import com.cardealership.domain.pojos.BrandCarPojo;
import com.cardealership.persistance.entities.BrandCarEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

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
        BrandCarPojo toBrandCarPojo(BrandCarEntity brandEntity);

    /**
     * Convierte un pojo a una entidad de marca de carro
     * @param brandPojo Pojo a convertir
     * @return Entidad convertida
     */
    @InheritInverseConfiguration
        BrandCarEntity toBrandCarEntity(BrandCarPojo brandPojo);

    /**
     * Retorna una lista de marcas de carro transformada a pojo de una lista de entidades
     * @param brandCarEntities Entidad a transformar
     * @return Lista transformar
     */
    List<BrandCarPojo> toBrandCarPojo(List<BrandCarEntity> brandCarEntities);
}
