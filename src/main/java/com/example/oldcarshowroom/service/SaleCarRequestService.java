package com.example.oldcarshowroom.service;

import com.example.oldcarshowroom.model.dto.SaleCarRequestDto;
import com.example.oldcarshowroom.model.request.SaleCarRequestRequestEntity;
import com.example.oldcarshowroom.model.response.SaleCarRequestResponseEntity;
import com.example.oldcarshowroom.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SaleCarRequestService {

    private final SaleCarRequestRepository saleCarRequestRepository;

    private final CarRepository carRepository;

    private final UserRepository userRepository;

    private final ShowroomRepository showroomRepository;



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
                .status(entity.isStatus())
                .date(entity.getDate())
                .userDto(userRepository.findById(entity.getUserID()).orElseThrow())
                .carDto(carRepository.findById(entity.getCarID()).orElseThrow())
                .showroomDto(showroomRepository.findById(entity.getShowroomID()).orElseThrow())
                .build();

        return SaleCarRequestResponseEntity.fromSaleCarRequestDto(saleCarRequestRepository.save(dto));
    }


    public SaleCarRequestResponseEntity updateExistedSaleCarRequest(int id, SaleCarRequestRequestEntity entity) {
        SaleCarRequestDto dto = saleCarRequestRepository.findById(id).orElseThrow();

        dto.setDate(entity.getDate());
        dto.setStatus(entity.isStatus());
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
}
