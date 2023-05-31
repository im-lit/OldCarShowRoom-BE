package com.example.oldcarshowroom.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.oldcarshowroom.model.dto.RoleDto;
import com.example.oldcarshowroom.model.response.RoleEntity;
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
        List<RoleEntity> listEntity = roleService.getAllRoles();
        return ResponseEntity.ok().body(listEntity);
    }

    @GetMapping("/{id}")
    private ResponseEntity getRoleByRoleID(@PathVariable String id) {
        RoleEntity entity = roleService.getRoleByRoleID(id);
        return ResponseEntity.ok().body(entity);
    }

    @PostMapping()
    public ResponseEntity createNewRole(@RequestBody RoleEntity entity) {
        if(roleService.isExisted(entity.getRoleID())){
            return ResponseEntity.badRequest().body("Role Id is duplicated");
        }
        return ResponseEntity.ok().body(roleService.createNewRole(entity));
    }

    @PutMapping
    private ResponseEntity updateExistedRole(@RequestBody RoleEntity entity) {
        return ResponseEntity.ok().body(roleService.updateExistedRole(entity));
    }

    @DeleteMapping()
    private ResponseEntity deleteExistedRole(@RequestParam String id) {
        return ResponseEntity.ok().body(roleService.deleteExistedRole(id));
    }


}
