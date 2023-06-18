package com.example.oldcarshowroom.service;

import lombok.RequiredArgsConstructor;
import net.bytebuddy.utility.RandomString;
import org.springframework.stereotype.Service;

import com.example.oldcarshowroom.model.dto.RoleDto;
import com.example.oldcarshowroom.model.dto.UserDto;
import com.example.oldcarshowroom.model.response.RoleEntity;
import com.example.oldcarshowroom.model.response.UserEntity;
import com.example.oldcarshowroom.repository.RoleRepository;
import com.example.oldcarshowroom.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

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
                .userName(entity.getUserName())
                .password(entity.getPassword())
                .fullName(entity.getFullName())
                .phone(entity.getPhone())
                .address(entity.getAddress())
                .avatarUrl(entity.getAvatarUrl())
                .status(entity.isStatus())
                .roleDto(roleRepository.findById(String.valueOf(entity.getRoleID())).orElseThrow())
                .build();

        return UserEntity.fromUserDto(userRepository.save(dto));
    }


    public UserEntity updateExistedUser(String id, UserEntity entity) {
        UserDto dto = userRepository.findById(id).orElseThrow();

        //dto.setUserID(entity.getUserID());
        dto.setPassword(entity.getPassword());
        dto.setUserName(entity.getUserName());
        dto.setFullName(entity.getFullName());
        dto.setPhone(entity.getPhone());
        dto.setAddress(entity.getAddress());
        dto.setAvatarUrl(entity.getAvatarUrl());
        dto.setStatus(entity.isStatus());
        dto.setRoleDto(roleRepository.findById(String.valueOf(entity.getRoleID())).orElseThrow());

        return UserEntity.fromUserDto(userRepository.save(dto));
    }

    public UserEntity deleteExistedUser(String id) {
        UserDto dto = userRepository.findById(id).orElseThrow();
        userRepository.deleteById(id);
        return UserEntity.fromUserDto(dto);
    }

    public UserEntity checkLogin(String userName, String password) {
        //123213
        return UserEntity.fromUserDto(userRepository.checkLoginUserByUserIdAndPassword(userName, password));

    }

    public List<UserEntity> getAllUser(){
        return userRepository.findAll().stream()
                .map(UserEntity::fromUserDto)
                .collect(Collectors.toList());
    }


}
