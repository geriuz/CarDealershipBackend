package com.cardealership.domain.controllers;

import com.cardealership.domain.pojos.BrandCarPojo;
import com.cardealership.domain.services.IBrandCarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador rest de marca de carro
 */
@RestController
@RequestMapping(path = "/brand-cars")
@RequiredArgsConstructor
public class BrandCarController {

    /**
     * Servicio de marca de carro
     */
    private final IBrandCarService iBrandCarService;

    /**
     * Devuelve lista de marcas del carro
     * @return HttpCode Ok con lista de marcas coche
     */
    @GetMapping()
    public ResponseEntity<List<BrandCarPojo>> getAll() {
        return ResponseEntity.ok(iBrandCarService.getAll());
        // return ResponseEntity.status(HttpStatus.OK)
        //        .body(iBrandCarService.getAll()); ALTERNATIVA PARA CREAR RESPONSE_ENTITY
        // return new ResponseEntity<>(iBrandCarService.getAll(), HttpStatus.OK); ALTERNATIVA PARA CREAR RESPONSE_ENTITY
    }

    /**
     * Devuelve una marca del carro  dado su id
     * @param id Id de la marca del carro  a buscar
     * @return HttpCode Ok si la encuentra, HttpCode Not found de lo contrario
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity<BrandCarPojo> getBrandCar(@PathVariable Integer id) {
        return ResponseEntity.of(iBrandCarService.getBrandCar(id));
    }

    /**
     * Crea una nueva marca del carro
     * @param brandCarPojoNew Marca del carro  a crear
     * @return HttpCode Created si la guarda correctamente, HttpCode BadRequest de lo contrario
     */
    @PostMapping()
    public ResponseEntity<BrandCarPojo> save(@RequestBody BrandCarPojo brandCarPojoNew) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(iBrandCarService.save(brandCarPojoNew));
        } catch (Exception e){
            //Corregir porque no está mandando excepcion
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    /**
     * Actualiza una marca del carro
     * @param brandCarPojoUpdated Marca del carro  actualizada
     * @return HttpCode Ok si la actualiza correctamente
     */
    @PutMapping
    public ResponseEntity<BrandCarPojo> update(@RequestBody BrandCarPojo brandCarPojoUpdated) {
        return ResponseEntity.status(HttpStatus.CREATED)
                    .body(iBrandCarService.save(brandCarPojoUpdated));
    }

    /**
     * Elimina una marca del carro  dado su id
     * @param id Id de la marca del carro a eliminar
     * @return HttpCode Ok si la elimina, HttpCode Not Found si no existe
     */
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id){
        return new ResponseEntity<>(this.iBrandCarService.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}
