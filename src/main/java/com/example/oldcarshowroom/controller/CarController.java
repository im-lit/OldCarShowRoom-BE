package com.example.oldcarshowroom.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.oldcarshowroom.model.response.CarEntity;
import com.example.oldcarshowroom.model.response.UserEntity;
import com.example.oldcarshowroom.service.CarService;
import com.example.oldcarshowroom.service.UserService;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController  {

    private final CarService carService;


    @GetMapping("/{id}")
    private ResponseEntity getCarByCarID(@PathVariable String id) {
        CarEntity entity = carService.getCarByCarID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping("/userid/{id}")
    private ResponseEntity getUserByUserID(@PathVariable String id){
        List<CarEntity> entity = carService.getCarByUserID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping("/showroomid/{id}")
    private ResponseEntity getCarByShowroomID(@PathVariable String id){
        List<CarEntity> entity = carService.getCarByShowroomID(id);
        return ResponseEntity.ok().body(entity);
    }

    @PostMapping()
    public ResponseEntity createNewCar(@RequestBody CarEntity entity) {
        if(carService.isExisted(entity.getCarID())){
            return ResponseEntity.badRequest().body("Car Id is duplicated");
        }
        return ResponseEntity.ok().body(carService.createNewCar(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedCar(@RequestBody CarEntity entity) {
        return ResponseEntity.ok().body(carService.updateExistedCar(entity));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedCar(@RequestParam String id) {
        return ResponseEntity.ok().body(carService.deleteExistedCar(id));
    }
}
