package com.example.oldcarshowroom.controller;

import com.example.oldcarshowroom.model.request.RoleRequestEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.oldcarshowroom.model.response.RoleResponseEntity;
import com.example.oldcarshowroom.service.RoleService;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/roles")
public class RoleController {
    private final RoleService roleService;

    @GetMapping
    private ResponseEntity getAllRoles() {
        List<RoleResponseEntity> listEntity = roleService.getAllRoles();
        return ResponseEntity.ok().body(listEntity);
    }

    @GetMapping("/{id}")
    private ResponseEntity getRoleByRoleID(@PathVariable int id) {
        RoleResponseEntity entity = roleService.getRoleByRoleID(id);
        return ResponseEntity.ok().body(entity);
    }

    @PostMapping()
    public ResponseEntity createNewRole(@RequestBody RoleRequestEntity entity) {
        return ResponseEntity.ok().body(roleService.createNewRole(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedRole(@RequestParam int id,@RequestBody RoleRequestEntity entity) {
        return ResponseEntity.ok().body(roleService.updateExistedRole(id, entity));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedRole(@RequestParam int id) {
        return ResponseEntity.ok().body(roleService.deleteExistedRole(id));
    }


}
