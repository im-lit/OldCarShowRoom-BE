package com.example.oldcarshowroom.controller;

import java.util.List;

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

import com.example.oldcarshowroom.model.request.RoleRequestEntity;
import com.example.oldcarshowroom.model.response.RoleResponseEntity;
import com.example.oldcarshowroom.service.RoleService;

import lombok.RequiredArgsConstructor;

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
