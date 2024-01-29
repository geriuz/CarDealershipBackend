package com.cardealership.persistance.repositories;

import com.cardealership.domain.pojos.BrandCarPojo;
import com.cardealership.domain.repositories.IBrandCarRepository;
import com.cardealership.persistance.entities.BrandCarEntity;
import com.cardealership.persistance.mappers.IBrandCarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repositorio de marca de carros
 */
@RequiredArgsConstructor
@Repository
public class BrandCarRepository implements IBrandCarRepository {

    /**
     * Crud de marca de carro
     */
    private final IBrandCarCrudRepository iBrandCarCrudRepository;
    /**
     * Mapper de marca de carro
     */
    private final IBrandCarMapper iBrandCarMapper;

    /**
     * Devuelve una lista con todas las marcas de ca
     *
     * @return Lista con marcas de carros
     */
    @Override
    public List<BrandCarPojo> getAll() {
        return iBrandCarMapper.toBrandCarPojo(iBrandCarCrudRepository.findAll());
    }

    /**
     * Devuelve una marca de carro dada su id
     *
     * @param id Id de marca carro
     * @return Optional del marca carro encontrado
     */
    @Override
    public Optional<BrandCarPojo> getBrandCar(Integer id) {
        return iBrandCarCrudRepository.findById(id)
                .map(iBrandCarMapper::toBrandCarPojo);
        // brandCarEntity -> iBrandCarMapper.toMarcaCochePojo(brandCarEntity) - LAMBDA
        // iBrandCarMapper::toMarcaCochePojo - Metodo por REFERENCIA
    }

    /**
     * Guarda una nueva marca de carro
     *
     * @param newBrandCar Marca de carro a guardar
     * @return Marca carro guardada
     */
    @Override
    public BrandCarPojo save(BrandCarPojo newBrandCar) {
        BrandCarEntity brandCarEntity = iBrandCarMapper.toBrandCarEntity(newBrandCar);
        return iBrandCarMapper.toBrandCarPojo(iBrandCarCrudRepository.save(brandCarEntity));
    }

    /**
     * Elimina una marca de carro dado su id
     * @param idBrandCar Id de la marca de carro a eliminar
     */
    @Override
    public void delete(Integer idBrandCar) {
        iBrandCarCrudRepository.deleteById(idBrandCar);
    }
}
