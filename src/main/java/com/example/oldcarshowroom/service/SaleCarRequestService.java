package com.example.oldcarshowroom.service;

import com.example.oldcarshowroom.model.dto.SaleCarRequestDto;
import com.example.oldcarshowroom.model.request.SaleCarRequestRequestEntity;
import com.example.oldcarshowroom.model.response.SaleCarRequestResponseEntity;
import com.example.oldcarshowroom.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SaleCarRequestService {

    private final SaleCarRequestRepository saleCarRequestRepository;

    private final CarRepository carRepository;

    private final UserRepository userRepository;

    private final ShowroomRepository showroomRepository;

    String fmt = "dd/MM/yyyy HH:mm";


    public SaleCarRequestResponseEntity getSaleCarBySaleCarID(int id) {
        return SaleCarRequestResponseEntity.fromSaleCarRequestDto(saleCarRequestRepository.getById(id));
    }

    public List<SaleCarRequestResponseEntity> getSaleCarByShowRoomID(int id) {
        return saleCarRequestRepository.getSaleCarByShowRoomID(id).stream()
                .map(SaleCarRequestResponseEntity::fromSaleCarRequestDto)
                .collect(Collectors.toList());
    }

    public List<SaleCarRequestResponseEntity> getSaleCarByUserID(int id) {
        return saleCarRequestRepository.getSaleCarByUserID(id).stream()
                .map(SaleCarRequestResponseEntity::fromSaleCarRequestDto)
                .collect(Collectors.toList());
    }

    public List<SaleCarRequestResponseEntity> getSaleCarByCarID(int id) {
        return saleCarRequestRepository.getSaleCarByCarID(id).stream()
                .map(SaleCarRequestResponseEntity::fromSaleCarRequestDto)
                .collect(Collectors.toList());
    }

    public SaleCarRequestResponseEntity createNewSaleCarRequest(SaleCarRequestRequestEntity entity) {
        SaleCarRequestDto dto = SaleCarRequestDto.builder()
                .status(SaleCarRequestDto.SaleCarStatus.valueOf(entity.getStatus()))
                .createdDate(LocalDate.now())
                .dateTrading(LocalDateTime.parse(entity.getDateTrading(), DateTimeFormatter.ofPattern(fmt)))
                .userDto(userRepository.findById(entity.getUserID()).orElseThrow())
                .carDto(carRepository.findById(entity.getCarID()).orElseThrow())
                .showroomDto(showroomRepository.findById(entity.getShowroomID()).orElseThrow())
                .build();

        return SaleCarRequestResponseEntity.fromSaleCarRequestDto(saleCarRequestRepository.save(dto));
    }


    public SaleCarRequestResponseEntity updateExistedSaleCarRequest(int id, SaleCarRequestRequestEntity entity) {
        SaleCarRequestDto dto = saleCarRequestRepository.findById(id).orElseThrow();

        dto.setDateTrading(LocalDateTime.parse(entity.getDateTrading(), DateTimeFormatter.ofPattern(fmt)));
        dto.setStatus(SaleCarRequestDto.SaleCarStatus.valueOf(entity.getStatus()));
        dto.setCarDto(carRepository.findById(entity.getUserID()).orElseThrow());
        dto.setUserDto(userRepository.findById(entity.getUserID()).orElseThrow());
        dto.setShowroomDto(showroomRepository.findById(entity.getShowroomID()).orElseThrow());

        return SaleCarRequestResponseEntity.fromSaleCarRequestDto(saleCarRequestRepository.save(dto));
    }

    public SaleCarRequestResponseEntity deleteExistedSaleCarRequest(int id) {
        SaleCarRequestDto dto = saleCarRequestRepository.findById(id).orElseThrow();
        saleCarRequestRepository.deleteById(id);
        return SaleCarRequestResponseEntity.fromSaleCarRequestDto(dto);
    }
    
    public SaleCarRequestResponseEntity updateStatusExistedSaleCarRequest(int id, String status) {
        SaleCarRequestDto dto = saleCarRequestRepository.findById(id).orElseThrow();
        dto.setStatus(SaleCarRequestDto.SaleCarStatus.valueOf(status));
        return SaleCarRequestResponseEntity.fromSaleCarRequestDto(saleCarRequestRepository.save(dto));
    }
}
