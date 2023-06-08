package com.example.oldcarshowroom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.oldcarshowroom.model.dto.RoleDto;
import com.example.oldcarshowroom.model.dto.UserDto;
import com.example.oldcarshowroom.model.response.RoleEntity;
import com.example.oldcarshowroom.model.response.UserEntity;
import com.example.oldcarshowroom.repository.RoleRepository;
import com.example.oldcarshowroom.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public boolean isExisted(String id) {
        return userRepository.existsById(id);
    }

    public UserEntity getUserByUserID(String id) {
        return UserEntity.fromUserDto(userRepository.getById(id));
    }

    public UserEntity createNewUser(UserEntity entity) {
        UserDto dto = UserDto.builder()
                .userID(entity.getUserID())
                .password(entity.getPassword())
                .fullName(entity.getFullName())
                .phone(entity.getPhone())
                .address(entity.getAddress())
                .avatarUrl(entity.getAvatarUrl())
                .status(entity.isStatus())
                .roleDto(roleRepository.findById(entity.getRoleID()).orElseThrow())
                .build();

        return UserEntity.fromUserDto(userRepository.save(dto));
    }


    public UserEntity updateExistedUser(UserEntity entity) {
        UserDto dto = userRepository.findById(entity.getUserID()).orElseThrow();

        dto.setUserID(entity.getUserID());
        dto.setPassword(entity.getPassword());
        dto.setFullName(entity.getFullName());
        dto.setPhone(entity.getPhone());
        dto.setAddress(entity.getAddress());
        dto.setAvatarUrl(entity.getAvatarUrl());
        dto.setStatus(entity.isStatus());
        dto.setRoleDto(roleRepository.findById(entity.getRoleID()).orElseThrow());

        return UserEntity.fromUserDto(userRepository.save(dto));
    }

    public UserEntity deleteExistedUser(String id) {
        UserDto dto = userRepository.findById(id).orElseThrow();
        userRepository.deleteById(id);
        return UserEntity.fromUserDto(dto);
    }

    public UserEntity checkLogin(String id, String password){
        //123213
        return UserEntity.fromUserDto(userRepository.checkLoginUserByUserIdAndPassword(id,password));

    }



}
