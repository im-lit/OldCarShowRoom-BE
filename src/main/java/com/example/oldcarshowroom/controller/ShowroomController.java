package com.example.oldcarshowroom.controller;

import com.example.oldcarshowroom.model.request.ShowroomRequestEntity;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.oldcarshowroom.model.response.ShowroomResponseEntity;
import com.example.oldcarshowroom.service.ShowroomService;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/showrooms")
public class ShowroomController {


    private final ShowroomService showroomService; 
    
    @GetMapping
    private ResponseEntity getAllShowroom() {
    	return ResponseEntity.ok().body(showroomService.getAllShowroom());
    }


    @GetMapping("/{id}")
    private ResponseEntity getShowroomByShowroomID(@PathVariable int id) {
        ShowroomResponseEntity entity = showroomService.getShowroomByShowroomID(id);
        return ResponseEntity.ok().body(entity);
    }
    
    @GetMapping("/get-showroom/{id}")
    private ResponseEntity getShowroomByUserID(@PathVariable int id) {
        List<ShowroomResponseEntity> entity = showroomService.getShowroomByUserID(id);
        return ResponseEntity.ok().body(entity);
    }
    

    @PostMapping()
    public ResponseEntity createNewShowroom(@RequestBody ShowroomRequestEntity entity) {
        return ResponseEntity.ok().body(showroomService.createNewShowroom(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedShowroom(@RequestParam int id, @RequestBody ShowroomRequestEntity entity) {
        return ResponseEntity.ok().body(showroomService.updateExistedShowroom(id, entity));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedShowroom(@RequestParam int id) {
        return ResponseEntity.ok().body(showroomService.deleteExistedShowroom(id));
    }
}
