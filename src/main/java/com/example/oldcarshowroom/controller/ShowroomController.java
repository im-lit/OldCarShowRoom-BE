package com.example.oldcarshowroom.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.oldcarshowroom.model.response.RoleEntity;
import com.example.oldcarshowroom.model.response.ShowroomEntity;
import com.example.oldcarshowroom.service.RoleService;
import com.example.oldcarshowroom.service.ShowroomService;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/showrooms")
public class ShowroomController {


    private final ShowroomService showroomService;


    @GetMapping("/{id}")
    private ResponseEntity getShowroomByShowroomID(@PathVariable int id) {
        ShowroomEntity entity = showroomService.getShowroomByShowroomID(id);
        return ResponseEntity.ok().body(entity);
    }

    @PostMapping()
    public ResponseEntity createNewShowroom(@RequestBody ShowroomEntity entity) {
        return ResponseEntity.ok().body(showroomService.createNewShowroom(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedShowroom(@RequestParam int id, @RequestBody ShowroomEntity entity) {
        return ResponseEntity.ok().body(showroomService.updateExistedShowroom(id, entity));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedShowroom(@RequestParam int id) {
        return ResponseEntity.ok().body(showroomService.deleteExistedShowroom(id));
    }
}
