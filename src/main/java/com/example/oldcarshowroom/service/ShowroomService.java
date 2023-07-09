package com.example.oldcarshowroom.service;

import com.example.oldcarshowroom.model.request.ShowroomRequestEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.oldcarshowroom.model.dto.ShowroomDto;
import com.example.oldcarshowroom.model.response.ShowroomResponseEntity;
import com.example.oldcarshowroom.repository.ShowroomRepository;
import com.example.oldcarshowroom.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ShowroomService {
    private final ShowroomRepository showroomRepository;

    private final UserRepository userRepository;

    public boolean isExisted(Integer id) {
        return showroomRepository.existsById(id);
    }
    
    public List<ShowroomResponseEntity> getAllShowroom() {
        return showroomRepository.findAll().stream()
                .map(ShowroomResponseEntity::fromShowroomDto)
                .collect(Collectors.toList());
    } 


    public ShowroomResponseEntity createNewShowroom(ShowroomRequestEntity entity) {
        ShowroomDto dto = ShowroomDto.builder()
                .showroomName(entity.getShowroomName())
                .showroomAddress(entity.getShowroomAddress())
                .showroomPhone(entity.getShowroomPhone())
                .showroomAvatar(entity.getShowroomAvatar())
                .userDto(userRepository.findById(entity.getUserID()).orElseThrow())
                .build();

        return ShowroomResponseEntity.fromShowroomDto(showroomRepository.save(dto));
    }


    public ShowroomResponseEntity getShowroomByShowroomID(int id) {
        return ShowroomResponseEntity.fromShowroomDto(showroomRepository.getById(id));
    }
    public List<ShowroomResponseEntity> getShowroomByUserID(int id) {
        return showroomRepository.getShowroomByUserId(id).stream().
        		map(ShowroomResponseEntity::fromShowroomDto)
        		.collect(Collectors.toList());
    }
    

    public ShowroomResponseEntity updateExistedShowroom(int id, ShowroomRequestEntity entity) {
        ShowroomDto dto = showroomRepository.findById(id).orElseThrow();

        dto.setShowroomName(entity.getShowroomName());
        dto.setShowroomAddress(entity.getShowroomAddress());
        dto.setShowroomPhone(entity.getShowroomPhone());
        dto.setUserDto(userRepository.findById(entity.getUserID()).orElseThrow());

        return ShowroomResponseEntity.fromShowroomDto(showroomRepository.save(dto));
    }

    public ShowroomResponseEntity deleteExistedShowroom(int id) {
        ShowroomDto dto = showroomRepository.findById(id).orElseThrow();
        showroomRepository.deleteById(id);
        return ShowroomResponseEntity.fromShowroomDto(dto);
    }



}
