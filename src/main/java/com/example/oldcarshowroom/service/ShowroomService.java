package com.example.oldcarshowroom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.oldcarshowroom.model.dto.RoleDto;
import com.example.oldcarshowroom.model.dto.ShowroomDto;
import com.example.oldcarshowroom.model.response.CarEntity;
import com.example.oldcarshowroom.model.response.RoleEntity;
import com.example.oldcarshowroom.model.response.ShowroomEntity;
import com.example.oldcarshowroom.model.response.UserEntity;
import com.example.oldcarshowroom.repository.RoleRepository;
import com.example.oldcarshowroom.repository.ShowroomRepository;
import com.example.oldcarshowroom.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ShowroomService {
    private final ShowroomRepository showroomRepository;

    private final UserRepository userRepository;

    public boolean isExisted(String id) {
        return showroomRepository.existsById(id);
    }
    
    public List<ShowroomEntity> getAllShowroom() {
        return showroomRepository.findAll().stream()
                .map(ShowroomEntity::fromShowroomDto)
                .collect(Collectors.toList());
    } 

    public ShowroomEntity createNewShowroom(ShowroomEntity entity) {
        ShowroomDto dto = ShowroomDto.builder()
                .showroomName(entity.getShowroomName())
                .showroomAddress(entity.getShowroomAddress())
                .showroomPhone(entity.getShowroomPhone())
                .userDto(userRepository.findById(entity.getUserID()).orElseThrow())
                .build();

        return ShowroomEntity.fromShowroomDto(showroomRepository.save(dto));
    }


    public ShowroomEntity getShowroomByShowroomID(String id) {
        return ShowroomEntity.fromShowroomDto(showroomRepository.getById(id));
    }

    public ShowroomEntity updateExistedShowroom(String id, ShowroomEntity entity) {
        ShowroomDto dto = showroomRepository.findById(id).orElseThrow();

        dto.setShowroomName(entity.getShowroomName());
        dto.setShowroomAddress(entity.getShowroomAddress());
        dto.setShowroomPhone(entity.getShowroomPhone());
        dto.setUserDto(userRepository.findById(entity.getUserID()).orElseThrow());

        return ShowroomEntity.fromShowroomDto(showroomRepository.save(dto));
    }

    public ShowroomEntity deleteExistedShowroom(String id) {
        ShowroomDto dto = showroomRepository.findById(id).orElseThrow();
        showroomRepository.deleteById(id);
        return ShowroomEntity.fromShowroomDto(dto);
    }



}
