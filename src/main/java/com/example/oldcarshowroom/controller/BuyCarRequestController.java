package com.example.oldcarshowroom.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.oldcarshowroom.model.response.BuyCarRequestEntity;
import com.example.oldcarshowroom.service.BuyCarRequestService;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/buycarrequests")
public class BuyCarRequestController {

    private final BuyCarRequestService buyCarRequestService;


    @GetMapping("/{id}")
    private ResponseEntity getBuyCarByBuyCarID(@PathVariable int id) {
        BuyCarRequestEntity entity = buyCarRequestService.getBuyCarByBuyCarID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping("/userid/{id}")
    private ResponseEntity getBuyCarByUserID(@PathVariable int id){
        List<BuyCarRequestEntity> entity = buyCarRequestService.getBuyCarByUserID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping("/showroomid/{id}")
    private ResponseEntity getCarByShowroomID(@PathVariable int id){
        List<BuyCarRequestEntity> entity = buyCarRequestService.getBuyCarByShowroomID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping("/carid/{id}")
    private ResponseEntity getBuyCarByCarID(@PathVariable int id){
        List<BuyCarRequestEntity> entity = buyCarRequestService.getBuyCarByCarID(id);
        return ResponseEntity.ok().body(entity);
    }

    @PostMapping()
    public ResponseEntity createNewBuyCarRequest(@RequestBody BuyCarRequestEntity entity) {
        return ResponseEntity.ok().body(buyCarRequestService.createNewBuyCarRequest(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedBuyCarRequest(@RequestParam int id,@RequestBody BuyCarRequestEntity entity) {
        return ResponseEntity.ok().body(buyCarRequestService.updateExistedBuyCarRequest(id, entity));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedBuyCarRequest(@RequestParam int id) {
        return ResponseEntity.ok().body(buyCarRequestService.deleteExistedBuyCarRequest(id));
    }
}
