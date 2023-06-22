package com.example.oldcarshowroom.controller;

import com.example.oldcarshowroom.model.request.CarRequestEntity;
import com.example.oldcarshowroom.model.request.CarStatusRequestEntity;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.oldcarshowroom.model.response.CarResponseEntity;
import com.example.oldcarshowroom.service.CarService;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController  {

    private final CarService carService;


    @GetMapping("/{id}")
    private ResponseEntity getCarByCarID(@PathVariable int id) {
        CarResponseEntity entity = carService.getCarByCarID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping
    private ResponseEntity getAllCarCanSale(){
        return ResponseEntity.ok().body(carService.getAllCarCanSale());
    }
    
    @GetMapping("/sort")
    private ResponseEntity get5MostExpensiveCar(){
        return ResponseEntity.ok().body(carService.find5MostExpensiveCar());
    }

    @GetMapping("/search")
    private ResponseEntity searchCarByCarNameOrCarBrandName(@RequestParam String searchName){
        List<CarResponseEntity> entity = carService.searchCarByCarNameOrCarBrandName(searchName);
        return ResponseEntity.ok().body(entity);
    }
    
    @GetMapping("/brandid/{brandId}")
    private ResponseEntity getAllCarCanSaleByBrandId(@PathVariable int brandId){
        List<CarResponseEntity> entity = carService.getAllCarCanSaleByBrandId(brandId);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping("/userid/{id}")
    private ResponseEntity getUserByUserID(@PathVariable int id){
        List<CarResponseEntity> entity = carService.getCarByUserID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping("/showroomid/{id}")
    private ResponseEntity getCarByShowroomID(@PathVariable int id){
        List<CarResponseEntity> entity = carService.getCarByShowroomID(id);
        return ResponseEntity.ok().body(entity);
    }

    @PostMapping()
    public ResponseEntity createNewCar(@RequestBody CarRequestEntity entity) {
        return ResponseEntity.ok().body(carService.createNewCar(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedCar(@RequestParam int id, @RequestBody CarRequestEntity entity) {
        return ResponseEntity.ok().body(carService.updateExistedCar(id, entity));
    }
    
    @PutMapping("/update/carid")
    private ResponseEntity updateStatusExistedCar(@RequestParam int id, @RequestBody CarStatusRequestEntity entity) {
        return ResponseEntity.ok().body(carService.updateStatusExistedCar(id, entity));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedCar(@RequestParam int id) {
        return ResponseEntity.ok().body(carService.deleteExistedCar(id));
    }
}
