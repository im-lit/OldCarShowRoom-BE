package com.example.oldcarshowroom.controller;

import com.example.oldcarshowroom.model.response.SaleCarRequestEntity;
import com.example.oldcarshowroom.oom.service.SaleCarRequestService;
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
    private ResponseEntity getSaleCarBySaleCarID(@PathVariable String id) {
        SaleCarRequestEntity entity = saleCarRequestService.getSaleCarBySaleCarID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping("/userid/{id}")
    private ResponseEntity getSaleCarByUserID(@PathVariable String id){
        List<SaleCarRequestEntity> entity = saleCarRequestService.getSaleCarByUserID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping("/showroomid/{id}")
    private ResponseEntity getSaleCarByShowRoomID(@PathVariable String id){
        List<SaleCarRequestEntity> entity = saleCarRequestService.getSaleCarByShowRoomID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping("/carid/{id}")
    private ResponseEntity getSaleCarByCarID(@PathVariable String id){
        List<SaleCarRequestEntity> entity = saleCarRequestService.getSaleCarByCarID(id);
        return ResponseEntity.ok().body(entity);
    }

    @PostMapping()
    public ResponseEntity createNewSaleCarRequest(@RequestBody SaleCarRequestEntity entity) {
        if(saleCarRequestService.isExisted(entity.getSaleCarID())){
            return ResponseEntity.badRequest().body("Sale Car Id is duplicated");
        }
        return ResponseEntity.ok().body(saleCarRequestService.createNewSaleCarRequest(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedSaleCarRequest(@RequestParam String id,
                                                       @RequestBody SaleCarRequestEntity entity) {
        return ResponseEntity.ok().body(saleCarRequestService.updateExistedSaleCarRequest(id, entity));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedSaleCarRequest(@RequestParam String id) {
        return ResponseEntity.ok().body(saleCarRequestService.deleteExistedSaleCarRequest(id));
    }

}
