package com.cardealership.domain.services;

import com.cardealership.domain.pojos.BrandCarPojo;
import com.cardealership.domain.repositories.IBrandCarRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BrandCarService implements IBrandCarService {
    /**
     * Repositorio de marca de carro
     */
    private final IBrandCarRepository iBrandCarRepository;

    /**
     * Devuelve una lista con todas las marcas de carros
     * @return Lista con marca de carros
     */
    @Override
    public List<BrandCarPojo> getAll() {
        return iBrandCarRepository.getAll();
    }

    /**
     * Devuelve una marca de corro dado su "id"
     * @param id Id de la marca del carro
     * @return optional de la marca de carro encontrado
     */
    @Override
    public Optional<BrandCarPojo> getBrandCar(Integer id) {
        return iBrandCarRepository.getBrandCar(id);
    }

    /**
     * Fuarda una nueva marca de carro
     * @param newBrandCar Marca de carro a guardar
     * @return Retorna una marca de carro guardada
     */
    @Override
    public BrandCarPojo save(BrandCarPojo newBrandCar) {
        return iBrandCarRepository.save(newBrandCar);
    }

    /**
     * Elimina una marca de carro dado su id
     * @param idBrandCar Id de la marca de carro a eliminar
     * @return true si se elimino, falso si ocurrió lo contrario
     */
    @Override
    public boolean delete(Integer idBrandCar) {
        try {
            iBrandCarRepository.delete(idBrandCar);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
