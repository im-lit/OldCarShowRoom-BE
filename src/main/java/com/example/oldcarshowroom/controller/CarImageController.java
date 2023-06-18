package com.example.oldcarshowroom.controller;

import com.example.oldcarshowroom.model.response.CarImageEntity;
import com.example.oldcarshowroom.model.response.RoleEntity;
import com.example.oldcarshowroom.service.CarImageService;
import com.example.oldcarshowroom.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/carimage")
public class CarImageController {
    private final CarImageService carImageService;

    @GetMapping("/{id}")
    private ResponseEntity getCarImageByCarImageID(@PathVariable String id) {
        CarImageEntity listEntity = carImageService.getCarImageByCarImageID(id);
        return ResponseEntity.ok().body(listEntity);
    }

    @GetMapping("/carID/{id}")
    private ResponseEntity getCarImageByCarID(@PathVariable String carID) {
        List<CarImageEntity> entity = carImageService.getCarImageByCarID(carID);
        return ResponseEntity.ok().body(entity);
    }

    @PostMapping()
    public ResponseEntity createNewCarImage(@RequestBody CarImageEntity entity) {

        return ResponseEntity.ok().body(carImageService.createNewCarImage(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedCarImage(@RequestParam String id,@RequestBody CarImageEntity entity) {
        return ResponseEntity.ok().body(carImageService.updateExistedCarImage(id, entity));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedCarImage(@RequestParam String id) {
        return ResponseEntity.ok().body(carImageService.deleteExistedCarImage(id));
    }

}
