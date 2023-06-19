package com.example.oldcarshowroom.service;

import com.example.oldcarshowroom.model.request.RoleRequestEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.oldcarshowroom.model.dto.RoleDto;
import com.example.oldcarshowroom.model.response.RoleResponseEntity;
import com.example.oldcarshowroom.repository.RoleRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;



    public RoleResponseEntity createNewRole(RoleRequestEntity entity) {
        RoleDto dto = RoleDto.builder()
//                .roleID(entity.getRoleID())
                .roleName(entity.getRoleName())
                .build();

        return RoleResponseEntity.fromRoleDto(roleRepository.save(dto));
    }

    public List<RoleResponseEntity> getAllRoles() {
        return roleRepository.findAll().stream()
                .map(RoleResponseEntity::fromRoleDto)
                .collect(Collectors.toList());
    }

    public RoleResponseEntity updateExistedRole(int id, RoleRequestEntity entity) {
        RoleDto dto = roleRepository.findById(id).orElseThrow();

//        dto.setRoleID(entity.getRoleID());
        dto.setRoleName(entity.getRoleName());

        return RoleResponseEntity.fromRoleDto(roleRepository.save(dto));
    }

    public RoleResponseEntity deleteExistedRole(int id) {
        RoleDto dto = roleRepository.findById(id).orElseThrow();
        roleRepository.deleteById(id);
        return RoleResponseEntity.fromRoleDto(dto);
    }


    public RoleResponseEntity getRoleByRoleID(int id) {
        return RoleResponseEntity.fromRoleDto(roleRepository.getById(id));
    }
}
