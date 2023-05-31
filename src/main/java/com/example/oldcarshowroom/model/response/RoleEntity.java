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
public class RoleEntity {

    private String roleID;

    private String roleName;

    public static RoleEntity fromRoleDto(RoleDto dto) {
        return RoleEntity.builder()
                .roleID(dto.getRoleID())
                .roleName(dto.getRoleName())
                .build();

    }

}
