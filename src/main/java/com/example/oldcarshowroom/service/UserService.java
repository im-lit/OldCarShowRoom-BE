package com.example.oldcarshowroom.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.oldcarshowroom.exception.LoginFailException2;
import com.example.oldcarshowroom.model.dto.UserDto;
import com.example.oldcarshowroom.model.request.UserRequestEntity;
import com.example.oldcarshowroom.model.response.UserResponseEntity;
import com.example.oldcarshowroom.repository.RoleRepository;
import com.example.oldcarshowroom.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;



    public UserResponseEntity getUserByUserID(int id) {
        return UserResponseEntity.fromUserDto(userRepository.getById(id));
    }

    public UserResponseEntity createNewUser(UserRequestEntity entity) {
        UserDto dto = UserDto.builder()
                .userName(entity.getUserName())
                .password(entity.getPassword())
                .fullName(entity.getFullName())
                .phone(entity.getPhone())
                .address(entity.getAddress())
                .mail(entity.getMail())
                .avatarUrl(entity.getAvatarUrl())
                .status(entity.isStatus())
                .roleDto(roleRepository.findById(entity.getRoleID()).orElseThrow())
                .build();

        return UserResponseEntity.fromUserDto(userRepository.save(dto));
    }


    public UserResponseEntity updateExistedUser(int id, UserRequestEntity entity) {
        UserDto dto = userRepository.findById(id).orElseThrow();

        //dto.setUserID(entity.getUserID());
        dto.setPassword(entity.getPassword());
        dto.setUserName(entity.getUserName());
        dto.setFullName(entity.getFullName());
        dto.setPhone(entity.getPhone());
        dto.setAddress(entity.getAddress());
        dto.setAvatarUrl(entity.getAvatarUrl());
        dto.setStatus(entity.isStatus());
        dto.setRoleDto(roleRepository.findById(entity.getRoleID()).orElseThrow());

        return UserResponseEntity.fromUserDto(userRepository.save(dto));
    }
    
    public UserResponseEntity updateStatusExistedUser(int id, boolean status) {
        UserDto dto = userRepository.findById(id).orElseThrow();
        dto.setStatus(status);
        return UserResponseEntity.fromUserDto(userRepository.save(dto));
    }

    public UserResponseEntity deleteExistedUser(int id) {
        UserDto dto = userRepository.findById(id).orElseThrow();
        userRepository.deleteById(id);
        return UserResponseEntity.fromUserDto(dto);
    }

    public UserResponseEntity checkLogin(String userName, String password) {
        UserDto dto = userRepository.checkLoginUserByUserIdAndPassword(userName, password).orElseThrow(()-> {
            throw new LoginFailException2("Wrong Username or password!!!");
        });
        return UserResponseEntity.fromUserDto(dto);
    }

    public List<UserResponseEntity> getAllUser(){
        return userRepository.findAll().stream()
                .map(UserResponseEntity::fromUserDto)
                .collect(Collectors.toList());
    }


}
