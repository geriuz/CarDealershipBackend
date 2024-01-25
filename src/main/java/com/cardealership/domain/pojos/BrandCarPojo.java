package com.cardealership.domain.pojos;

import lombok.Getter;
import lombok.Setter;


/**
 * Este el pojo de la entidad (tabla) marca carro
 */
@Getter
@Setter
public class BrandCarPojo {
    /**
     * Este representa en el pojo la columna id de la entidad brandcar
      */
    private Integer id;

    /**
     * Este representa en el pojo la columna description de la entidad brandcar
     */
    private String description;
}
