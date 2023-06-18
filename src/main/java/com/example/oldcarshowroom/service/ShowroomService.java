package com.example.oldcarshowroom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.oldcarshowroom.model.dto.RoleDto;
import com.example.oldcarshowroom.model.dto.ShowroomDto;
import com.example.oldcarshowroom.model.response.RoleEntity;
import com.example.oldcarshowroom.model.response.ShowroomEntity;
import com.example.oldcarshowroom.model.response.UserEntity;
import com.example.oldcarshowroom.repository.RoleRepository;
import com.example.oldcarshowroom.repository.ShowroomRepository;
import com.example.oldcarshowroom.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ShowroomService {
    private final ShowroomRepository showroomRepository;

    private final UserRepository userRepository;



    public ShowroomEntity createNewShowroom(ShowroomEntity entity) {
        ShowroomDto dto = ShowroomDto.builder()
                .showroomName(entity.getShowroomName())
                .showroomAddress(entity.getShowroomAddress())
                .showroomPhone(entity.getShowroomPhone())
                .userDto(userRepository.findById(entity.getUserID()).orElseThrow())
                .build();

        return ShowroomEntity.fromShowroomDto(showroomRepository.save(dto));
    }


    public ShowroomEntity getShowroomByShowroomID(int id) {
        return ShowroomEntity.fromShowroomDto(showroomRepository.getById(id));
    }

    public ShowroomEntity updateExistedShowroom(int id, ShowroomEntity entity) {
        ShowroomDto dto = showroomRepository.findById(id).orElseThrow();

        dto.setShowroomName(entity.getShowroomName());
        dto.setShowroomAddress(entity.getShowroomAddress());
        dto.setShowroomPhone(entity.getShowroomPhone());
        dto.setUserDto(userRepository.findById(entity.getUserID()).orElseThrow());

        return ShowroomEntity.fromShowroomDto(showroomRepository.save(dto));
    }

    public ShowroomEntity deleteExistedShowroom(int id) {
        ShowroomDto dto = showroomRepository.findById(id).orElseThrow();
        showroomRepository.deleteById(id);
        return ShowroomEntity.fromShowroomDto(dto);
    }



}
