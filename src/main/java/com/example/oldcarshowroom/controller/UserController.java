package com.example.oldcarshowroom.controller;

import com.example.oldcarshowroom.model.request.UserRequestEntity;
import lombok.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.oldcarshowroom.model.response.UserResponseEntity;
import com.example.oldcarshowroom.service.UserService;

import static com.example.oldcarshowroom.config.CommonUtils.controllerWrapper;

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
        return ResponseEntity.ok().body(userService.checkLogin(username,password));
//        return controllerWrapper(() -> userService.checkLogin(username, password));

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

    @DeleteMapping()
    private ResponseEntity deleteExistedUser(@RequestParam int id) {
        return ResponseEntity.ok().body(userService.deleteExistedUser(id));
    }
}
