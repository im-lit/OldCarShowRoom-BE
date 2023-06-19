package com.example.oldcarshowroom.controller;

import com.example.oldcarshowroom.model.request.CarImageRequestEntity;
import com.example.oldcarshowroom.model.response.CarImageResponseEntity;
import com.example.oldcarshowroom.service.CarImageService;
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
