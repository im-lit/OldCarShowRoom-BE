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

import com.example.oldcarshowroom.model.request.CarImageRequestEntity;
import com.example.oldcarshowroom.model.response.CarImageResponseEntity;
import com.example.oldcarshowroom.service.CarImageService;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/carimage")
public class CarImageController {
    private final CarImageService carImageService;

    @GetMapping("/{id}")
    private ResponseEntity getCarImageByCarImageID(@PathVariable int id) {
        CarImageResponseEntity listEntity = carImageService.getCarImageByCarImageID(id);
        return ResponseEntity.ok().body(listEntity);
    }


    @GetMapping("/carID/{carID}")
    private ResponseEntity getCarImageByCarID(@PathVariable Integer carID) {
        List<CarImageResponseEntity> entity = carImageService.getCarImageByCarID(carID);
        return ResponseEntity.ok().body(entity);
    }

    @PostMapping()
    public ResponseEntity createNewCarImage(@RequestBody CarImageRequestEntity entity) {

        return ResponseEntity.ok().body(carImageService.createNewCarImage(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedCarImage(@RequestParam int id,@RequestBody CarImageRequestEntity entity) {
        return ResponseEntity.ok().body(carImageService.updateExistedCarImage(id, entity));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedCarImage(@RequestParam int id) {
        return ResponseEntity.ok().body(carImageService.deleteExistedCarImage(id));
    }

}
