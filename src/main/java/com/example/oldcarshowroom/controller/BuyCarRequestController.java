package com.example.oldcarshowroom.controller;

import com.example.oldcarshowroom.model.request.BuyCarRequestRequestEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.oldcarshowroom.model.response.BuyCarRequestResponseEntity;
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
        BuyCarRequestResponseEntity entity = buyCarRequestService.getBuyCarByBuyCarID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping("/userid/{id}")
    private ResponseEntity getBuyCarByUserID(@PathVariable int id){
        List<BuyCarRequestResponseEntity> entity = buyCarRequestService.getBuyCarByUserID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping("/showroomid/{id}")
    private ResponseEntity getCarByShowroomID(@PathVariable int id){
        List<BuyCarRequestResponseEntity> entity = buyCarRequestService.getBuyCarByShowroomID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping("/carid/{id}")
    private ResponseEntity getBuyCarByCarID(@PathVariable int id){
        List<BuyCarRequestResponseEntity> entity = buyCarRequestService.getBuyCarByCarID(id);
        return ResponseEntity.ok().body(entity);
    }

    @PostMapping()
    public ResponseEntity createNewBuyCarRequest(@RequestBody BuyCarRequestRequestEntity entity) {
        return ResponseEntity.ok().body(buyCarRequestService.createNewBuyCarRequest(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedBuyCarRequest(@RequestParam int id,@RequestBody BuyCarRequestRequestEntity entity) {
        return ResponseEntity.ok().body(buyCarRequestService.updateExistedBuyCarRequest(id, entity));
    }
    @PutMapping("/{id}/status")
    private ResponseEntity updateStatusExistedBuyCarRequest(@PathVariable int id,
                                                            @RequestParam String status) {
        return ResponseEntity.ok().body(buyCarRequestService.updateStatusExistedBuyCarRequest(id, status));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedBuyCarRequest(@RequestParam int id) {
        return ResponseEntity.ok().body(buyCarRequestService.deleteExistedBuyCarRequest(id));
    }
}
