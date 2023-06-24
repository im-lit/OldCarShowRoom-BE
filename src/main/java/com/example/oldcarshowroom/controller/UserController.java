package com.example.oldcarshowroom.controller;

import static com.example.oldcarshowroom.config.CommonUtils.controllerWrapper;

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

import com.example.oldcarshowroom.model.request.UserRequestEntity;
import com.example.oldcarshowroom.model.response.UserResponseEntity;
import com.example.oldcarshowroom.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;


    @GetMapping("/{id}")
    private ResponseEntity getUserByUserID(@PathVariable int id) {
        UserResponseEntity entity = userService.getUserByUserID(id);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping()
    private ResponseEntity getAllUser() {
        return ResponseEntity.ok().body(userService.getAllUser());
    }

    @PostMapping("/login")
    private ResponseEntity<?> checkLogin(@RequestParam String username, @RequestParam String password) {
        //return ResponseEntity.ok().body(userService.checkLogin(username,password));
        return controllerWrapper(() -> userService.checkLogin(username, password));

    }

    @PostMapping()
    public ResponseEntity createNewUser(@RequestBody UserRequestEntity entity) {
        return ResponseEntity.ok().body(userService.createNewUser(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedUser(@RequestParam int id,
                                             @RequestBody UserRequestEntity entity) {

        return ResponseEntity.ok().body(userService.updateExistedUser(id, entity));
    }
    
    @PutMapping("/{id}/status")
    private ResponseEntity updateStatusExistedUser(@PathVariable  int id,
                                             @RequestParam boolean status) {

        return ResponseEntity.ok().body(userService.updateStatusExistedUser(id, status));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedUser(@RequestParam int id) {
        return ResponseEntity.ok().body(userService.deleteExistedUser(id));
    }
}
