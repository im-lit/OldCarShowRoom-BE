package com.example.oldcarshowroom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.oldcarshowroom.model.dto.RoleDto;
import com.example.oldcarshowroom.model.response.RoleEntity;
import com.example.oldcarshowroom.repository.RoleRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;



    public RoleEntity createNewRole(RoleEntity entity) {
        RoleDto dto = RoleDto.builder()
//                .roleID(entity.getRoleID())
                .roleName(entity.getRoleName())
                .build();

        return RoleEntity.fromRoleDto(roleRepository.save(dto));
    }

    public List<RoleEntity> getAllRoles() {
        return roleRepository.findAll().stream()
                .map(RoleEntity::fromRoleDto)
                .collect(Collectors.toList());
    }

    public RoleEntity updateExistedRole(int id, RoleEntity entity) {
        RoleDto dto = roleRepository.findById(id).orElseThrow();

//        dto.setRoleID(entity.getRoleID());
        dto.setRoleName(entity.getRoleName());

        return RoleEntity.fromRoleDto(roleRepository.save(dto));
    }

    public RoleEntity deleteExistedRole(int id) {
        RoleDto dto = roleRepository.findById(id).orElseThrow();
        roleRepository.deleteById(id);
        return RoleEntity.fromRoleDto(dto);
    }


    public RoleEntity getRoleByRoleID(int id) {
        return RoleEntity.fromRoleDto(roleRepository.getById(id));
    }
}
