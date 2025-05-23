package com.example.oldcarshowroom.controller;

import com.example.oldcarshowroom.model.response.SaleCarRequestEntity;
import com.example.oldcarshowroom.service.SaleCarRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/salecarrequests")
public class SaleCarRequestController {

    private final SaleCarRequestService saleCarRequestService;


    @GetMapping("/{id}")
    private ResponseEntity getSaleCarBySaleCarID(@PathVariable int id) {
        SaleCarRequestEntity entity = saleCarRequestService.getSaleCarBySaleCarID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping("/userid/{id}")
    private ResponseEntity getSaleCarByUserID(@PathVariable int id){
        List<SaleCarRequestEntity> entity = saleCarRequestService.getSaleCarByUserID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping("/showroomid/{id}")
    private ResponseEntity getSaleCarByShowRoomID(@PathVariable int id){
        List<SaleCarRequestEntity> entity = saleCarRequestService.getSaleCarByShowRoomID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping("/carid/{id}")
    private ResponseEntity getSaleCarByCarID(@PathVariable int id){
        List<SaleCarRequestEntity> entity = saleCarRequestService.getSaleCarByCarID(id);
        return ResponseEntity.ok().body(entity);
    }

    @PostMapping()
    public ResponseEntity createNewSaleCarRequest(@RequestBody SaleCarRequestEntity entity) {
        return ResponseEntity.ok().body(saleCarRequestService.createNewSaleCarRequest(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedSaleCarRequest(@RequestParam int id,
                                                       @RequestBody SaleCarRequestEntity entity) {
        return ResponseEntity.ok().body(saleCarRequestService.updateExistedSaleCarRequest(id, entity));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedSaleCarRequest(@RequestParam int id) {
        return ResponseEntity.ok().body(saleCarRequestService.deleteExistedSaleCarRequest(id));
    }

}
