package com.example.oldcarshowroom.controller;

import com.example.oldcarshowroom.model.response.CarBrandEntity;
import com.example.oldcarshowroom.service.CarBrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/carbrands")
public class CarBrandController {

    private final CarBrandService carBrandService = null;
    @GetMapping
    private ResponseEntity getAllCarBrands() {
        List<CarBrandEntity> listEntity = carBrandService.getAllCarBrands();
        return ResponseEntity.ok().body(listEntity);
    }

    @GetMapping("/{id}")
    private ResponseEntity getCarBrandByCarBrandID(@PathVariable String id) {
        CarBrandEntity entity = carBrandService.getCarBrandByCarBrandID(id);
        return ResponseEntity.ok().body(entity);
    }

    @PostMapping()
    public ResponseEntity createNewCarBrand(@RequestBody CarBrandEntity entity) {
        if(carBrandService.isExisted(entity.getCarBrandID())){
            return ResponseEntity.badRequest().body("Car Brand Id is duplicated");
        }
        return ResponseEntity.ok().body(carBrandService.createNewCarBrand(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedCarBrand(@RequestParam String id, @RequestBody CarBrandEntity entity) {
        return ResponseEntity.ok().body(carBrandService.updateExistedCarBrand(id, entity));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedCarBrand(@RequestParam String id) {
        return ResponseEntity.ok().body(carBrandService.deleteExistedCarBrand(id));
    }
}
