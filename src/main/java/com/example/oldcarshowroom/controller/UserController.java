package com.example.oldcarshowroom.controller;

import lombok.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.oldcarshowroom.model.dto.UserDto;
import com.example.oldcarshowroom.model.response.RoleEntity;
import com.example.oldcarshowroom.model.response.UserEntity;
import com.example.oldcarshowroom.service.RoleService;
import com.example.oldcarshowroom.service.UserService;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;


    @GetMapping("/{id}")
    private ResponseEntity getUserByUserID(@PathVariable int id) {
        UserEntity entity = userService.getUserByUserID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping()
    private ResponseEntity getAllUser(){
        return ResponseEntity.ok().body(userService.getAllUser());
    }

    @PostMapping("/login")
    private ResponseEntity checkLogin(@RequestParam String username, @RequestParam String password) {
        UserEntity entity = userService.checkLogin(username,password);
        if(entity == null){
            return ResponseEntity.badRequest().body("Wrong username & password");
        }
        return ResponseEntity.ok().body(entity);
    }

    @PostMapping()
    public ResponseEntity createNewUser(@RequestBody UserEntity entity) {
        return ResponseEntity.ok().body(userService.createNewUser(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedUser(@RequestParam int id ,
                                             @RequestBody UserEntity entity) {
        return ResponseEntity.ok().body(userService.updateExistedUser(id, entity));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedUser(@RequestParam int id) {
        return ResponseEntity.ok().body(userService.deleteExistedUser(id));
    }
}
