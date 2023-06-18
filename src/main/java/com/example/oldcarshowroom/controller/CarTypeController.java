package com.example.oldcarshowroom.controller;

import com.example.oldcarshowroom.model.response.CarTypeEntity;
import com.example.oldcarshowroom.service.CarTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/cartypes")
public class CarTypeController {

    private final CarTypeService carTypeService;

    @GetMapping
    private ResponseEntity getAllCarTypes() {
        List<CarTypeEntity> listEntity = carTypeService.getAllCarTypes();
        return ResponseEntity.ok().body(listEntity);
    }

    @GetMapping("/{id}")
    private ResponseEntity getCarTypeByCarTypeID(@PathVariable String id) {
        CarTypeEntity entity = carTypeService.getCarTypeByCarTypeID(id);
        return ResponseEntity.ok().body(entity);
    }

    @PostMapping()
    public ResponseEntity createNewCarType(@RequestBody CarTypeEntity entity) {
        return ResponseEntity.ok().body(carTypeService.createNewCarType(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedCarType(@RequestParam String id, @RequestBody CarTypeEntity entity) {
        return ResponseEntity.ok().body(carTypeService.updateExistedCarType(id, entity));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedCarType(@RequestParam String id) {
        return ResponseEntity.ok().body(carTypeService.deleteExistedCarType(id));
    }
}
