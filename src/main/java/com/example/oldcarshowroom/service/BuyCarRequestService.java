package com.example.oldcarshowroom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.oldcarshowroom.model.dto.BuyCarRequestDto;
import com.example.oldcarshowroom.model.response.BuyCarRequestEntity;
import com.example.oldcarshowroom.repository.BuyCarRequestRepository;
import com.example.oldcarshowroom.repository.CarRepository;
import com.example.oldcarshowroom.repository.ShowroomRepository;
import com.example.oldcarshowroom.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BuyCarRequestService {

    private final BuyCarRequestRepository buyCarRequestRepository;

    private final CarRepository carRepository;

    private final UserRepository userRepository;

    private final ShowroomRepository showroomRepository;


    public BuyCarRequestEntity getBuyCarByBuyCarID(int id) {
        return BuyCarRequestEntity.fromBuyCarRequestDto(buyCarRequestRepository.getById(id));
    }

    public List<BuyCarRequestEntity> getBuyCarByShowroomID(int id) {
        return buyCarRequestRepository.getBuyCarByShowRoomID(id).stream()
                .map(BuyCarRequestEntity::fromBuyCarRequestDto)
                .collect(Collectors.toList());
    }

    public List<BuyCarRequestEntity> getBuyCarByUserID(int id) {
        return buyCarRequestRepository.getBuyCarByUserID(id).stream()
                .map(BuyCarRequestEntity::fromBuyCarRequestDto)
                .collect(Collectors.toList());
    }

    public List<BuyCarRequestEntity> getBuyCarByCarID(int id) {
        return buyCarRequestRepository.getBuyCarByCarID(id).stream()
                .map(BuyCarRequestEntity::fromBuyCarRequestDto)
                .collect(Collectors.toList());
    }

    public BuyCarRequestEntity createNewBuyCarRequest(BuyCarRequestEntity entity) {
        BuyCarRequestDto dto = BuyCarRequestDto.builder()
                .status(entity.isStatus())
                .date(entity.getDate())
                .userDto(userRepository.findById(entity.getUserID()).orElseThrow())
                .carDto(carRepository.findById(entity.getCarID()).orElseThrow())
                .showroomDto(showroomRepository.findById(entity.getShowroomID()).orElseThrow())
                .build();

        return BuyCarRequestEntity.fromBuyCarRequestDto(dto);
    }


    public BuyCarRequestEntity updateExistedBuyCarRequest(int id, BuyCarRequestEntity entity) {
        BuyCarRequestDto dto = buyCarRequestRepository.findById(id).orElseThrow();

        dto.setDate(entity.getDate());
        dto.setStatus(entity.isStatus());
        dto.setCarDto(carRepository.findById(entity.getUserID()).orElseThrow());
        dto.setUserDto(userRepository.findById(entity.getUserID()).orElseThrow());
        dto.setShowroomDto(showroomRepository.findById(entity.getShowroomID()).orElseThrow());

        return BuyCarRequestEntity.fromBuyCarRequestDto(buyCarRequestRepository.save(dto));
    }

    public BuyCarRequestEntity deleteExistedBuyCarRequest(int id) {
        BuyCarRequestDto dto = buyCarRequestRepository.findById(id).orElseThrow();
        buyCarRequestRepository.deleteById(id);

        System.out.println("abc");
        return BuyCarRequestEntity.fromBuyCarRequestDto(dto);
    }




}
