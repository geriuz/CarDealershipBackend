package com.cardealership.persistance.entities;

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
    @Column (name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    /**
     * columna description de la entidad brandcar
     */
    @Column (name = "description")
    private String description;
}
