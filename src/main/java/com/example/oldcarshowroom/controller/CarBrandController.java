package com.example.oldcarshowroom.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.oldcarshowroom.model.request.CarBrandRequestEntity;
import com.example.oldcarshowroom.model.response.CarBrandResponseEntity;
import com.example.oldcarshowroom.service.CarBrandService;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/carbrands")
public class CarBrandController {

    private final CarBrandService carBrandService;
    @GetMapping
    private ResponseEntity getAllCarBrands() {
        List<CarBrandResponseEntity> listEntity = carBrandService.getAllCarBrands();
        return ResponseEntity.ok().body(listEntity);
    }

    @GetMapping("/{id}")
    private ResponseEntity getCarBrandByCarBrandID(@PathVariable int id) {
        CarBrandResponseEntity entity = carBrandService.getCarBrandByCarBrandID(id);
        return ResponseEntity.ok().body(entity);
    }

    @PostMapping()
    public ResponseEntity createNewCarBrand(@RequestBody CarBrandRequestEntity entity) {
        return ResponseEntity.ok().body(carBrandService.createNewCarBrand(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedCarBrand(@RequestParam int id, @RequestBody CarBrandRequestEntity entity) {
        return ResponseEntity.ok().body(carBrandService.updateExistedCarBrand(id, entity));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedCarBrand(@RequestParam int id) {
        return ResponseEntity.ok().body(carBrandService.deleteExistedCarBrand(id));
    }
}
