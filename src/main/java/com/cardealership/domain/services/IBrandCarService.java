package com.cardealership.domain.services;

import com.cardealership.domain.pojos.BrandCarPojo;
import java.util.List;
import java.util.Optional;

public interface IBrandCarService {
    /**
     * Devuelve una lista con todas las marcas de carros
     * @return Lista con marca de carros
     */
    List<BrandCarPojo> getAll();

    /**
     * Devuelve una marca de corro dado su "id"
     * @param id Id de la marca del carro
     * @return optional de la marca de carro encontrado
     */
    Optional<BrandCarPojo> getBrandCar(Integer id);

    /**
     * Fuarda una nueva marca de carro
     * @param newBrandCar Marca de carro a guardar
     * @return Retorna una marca de carro guardada
     */
    BrandCarPojo save(BrandCarPojo newBrandCar);

    /**
     * Elimina una marca de carro dado su id
     * @param idBrandCar Id de la marca de carro a eliminar
     */
    boolean  delete (Integer idBrandCar);
}
