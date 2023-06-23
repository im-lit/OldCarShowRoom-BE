package com.example.oldcarshowroom.service;

import com.example.oldcarshowroom.model.request.BuyCarRequestRequestEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.oldcarshowroom.model.dto.BuyCarRequestDto;
import com.example.oldcarshowroom.model.response.BuyCarRequestResponseEntity;
import com.example.oldcarshowroom.repository.BuyCarRequestRepository;
import com.example.oldcarshowroom.repository.CarRepository;
import com.example.oldcarshowroom.repository.ShowroomRepository;
import com.example.oldcarshowroom.repository.UserRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BuyCarRequestService {

    private final BuyCarRequestRepository buyCarRequestRepository;

    private final CarRepository carRepository;

    private final UserRepository userRepository;

    private final ShowroomRepository showroomRepository;

    String fmt = "dd/MM/yyyy HH:mm";


    public BuyCarRequestResponseEntity getBuyCarByBuyCarID(int id) {
        return BuyCarRequestResponseEntity.fromBuyCarRequestDto(buyCarRequestRepository.getById(id));
    }

    public List<BuyCarRequestResponseEntity> getBuyCarByShowroomID(int id) {
        return buyCarRequestRepository.getBuyCarByShowRoomID(id).stream()
                .map(BuyCarRequestResponseEntity::fromBuyCarRequestDto)
                .collect(Collectors.toList());
    }

    public List<BuyCarRequestResponseEntity> getBuyCarByUserID(int id) {
        return buyCarRequestRepository.getBuyCarByUserID(id).stream()
                .map(BuyCarRequestResponseEntity::fromBuyCarRequestDto)
                .collect(Collectors.toList());
    }

    public List<BuyCarRequestResponseEntity> getBuyCarByCarID(int id) {
        return buyCarRequestRepository.getBuyCarByCarID(id).stream()
                .map(BuyCarRequestResponseEntity::fromBuyCarRequestDto)
                .collect(Collectors.toList());
    }

    public BuyCarRequestResponseEntity createNewBuyCarRequest(BuyCarRequestRequestEntity entity) {

        BuyCarRequestDto dto = BuyCarRequestDto.builder()
                .status(BuyCarRequestDto.BuyCarStatus.valueOf(entity.getStatus()))
                .createdDate(LocalDate.now())
                .dateTrading(LocalDateTime.parse(entity.getDateTrading(), DateTimeFormatter.ofPattern(fmt)))
                .userDto(userRepository.findById(entity.getUserID()).orElseThrow())
                .carDto(carRepository.findById(entity.getCarID()).orElseThrow())
                .showroomDto(showroomRepository.findById(entity.getShowroomID()).orElseThrow())
                .build();

        return BuyCarRequestResponseEntity.fromBuyCarRequestDto(buyCarRequestRepository.save(dto));
    }


    public BuyCarRequestResponseEntity updateExistedBuyCarRequest(int id, BuyCarRequestRequestEntity entity) {
        BuyCarRequestDto dto = buyCarRequestRepository.findById(id).orElseThrow();

        dto.setDateTrading(LocalDateTime.parse(entity.getDateTrading(), DateTimeFormatter.ofPattern(fmt)));
        dto.setStatus(BuyCarRequestDto.BuyCarStatus.valueOf(entity.getStatus()));
        dto.setCarDto(carRepository.findById(entity.getUserID()).orElseThrow());
        dto.setUserDto(userRepository.findById(entity.getUserID()).orElseThrow());
        dto.setShowroomDto(showroomRepository.findById(entity.getShowroomID()).orElseThrow());

        return BuyCarRequestResponseEntity.fromBuyCarRequestDto(buyCarRequestRepository.save(dto));
    }

    public BuyCarRequestResponseEntity deleteExistedBuyCarRequest(int id) {
        BuyCarRequestDto dto = buyCarRequestRepository.findById(id).orElseThrow();
        buyCarRequestRepository.deleteById(id);

        return BuyCarRequestResponseEntity.fromBuyCarRequestDto(dto);
    }




}
