package com.example.oldcarshowroom.model.response;

import com.example.oldcarshowroom.model.dto.RoleDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleResponseEntity {

    private int roleID;

    private String roleName;

    public static RoleResponseEntity fromRoleDto(RoleDto dto) {
        return RoleResponseEntity.builder()
                .roleID(dto.getRoleID())
                .roleName(dto.getRoleName())
                .build();

    }
}
