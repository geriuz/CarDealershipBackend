package com.cardealership.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entidad de la tabla brandcar
 */
@Entity
@Table (name = "brandcar")
@Getter
@Setter
public class BrandCarEntity {

    /**
     * columna id de la entidad brandcar
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * columna description de la entidad brandcar
     */
    @Column
    private String description;
}
