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

import com.example.oldcarshowroom.model.request.CarTypeRequestEntity;
import com.example.oldcarshowroom.model.response.CarTypeResponseEntity;
import com.example.oldcarshowroom.service.CarTypeService;

import lombok.RequiredArgsConstructor;


@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/cartypes")
public class CarTypeController {

    private final CarTypeService carTypeService;

    @GetMapping
    private ResponseEntity getAllCarTypes() {
        List<CarTypeResponseEntity> listEntity = carTypeService.getAllCarTypes();
        return ResponseEntity.ok().body(listEntity);
    }

    @GetMapping("/{id}")
    private ResponseEntity getCarTypeByCarTypeID(@PathVariable int id) {
        CarTypeResponseEntity entity = carTypeService.getCarTypeByCarTypeID(id);
        return ResponseEntity.ok().body(entity);
    }

    @PostMapping()
    public ResponseEntity createNewCarType(@RequestBody CarTypeRequestEntity entity) {
        return ResponseEntity.ok().body(carTypeService.createNewCarType(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedCarType(@RequestParam int id, @RequestBody CarTypeRequestEntity entity) {
        return ResponseEntity.ok().body(carTypeService.updateExistedCarType(id, entity));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedCarType(@RequestParam int id) {
        return ResponseEntity.ok().body(carTypeService.deleteExistedCarType(id));
    }
}
