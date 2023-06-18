package com.example.oldcarshowroom.service;

import com.example.oldcarshowroom.model.dto.SaleCarRequestDto;
import com.example.oldcarshowroom.model.response.SaleCarRequestEntity;
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

    public boolean isExisted(String id) {
        return saleCarRequestRepository.existsById(id);
    }

    public SaleCarRequestEntity getSaleCarBySaleCarID(String id) {
        return SaleCarRequestEntity.fromSaleCarRequestDto(saleCarRequestRepository.getById(id));
    }

    public List<SaleCarRequestEntity> getSaleCarByShowRoomID(String id) {
        return saleCarRequestRepository.getSaleCarByShowRoomID(id).stream()
                .map(SaleCarRequestEntity::fromSaleCarRequestDto)
                .collect(Collectors.toList());
    }

    public List<SaleCarRequestEntity> getSaleCarByUserID(String id) {
        return saleCarRequestRepository.getSaleCarByUserID(id).stream()
                .map(SaleCarRequestEntity::fromSaleCarRequestDto)
                .collect(Collectors.toList());
    }

    public List<SaleCarRequestEntity> getSaleCarByCarID(String id) {
        return saleCarRequestRepository.getSaleCarByCarID(id).stream()
                .map(SaleCarRequestEntity::fromSaleCarRequestDto)
                .collect(Collectors.toList());
    }

    public SaleCarRequestEntity createNewSaleCarRequest(SaleCarRequestEntity entity) {
        SaleCarRequestDto dto = SaleCarRequestDto.builder()
                .status(entity.isStatus())
                .date(entity.getDate())
                .userDto(userRepository.findById(String.valueOf(entity.getUserID())).orElseThrow())
                .carDto(carRepository.findById(String.valueOf(entity.getCarID())).orElseThrow())
                .showroomDto(showroomRepository.findById(String.valueOf(entity.getShowroomID())).orElseThrow())
                .build();

        return SaleCarRequestEntity.fromSaleCarRequestDto(dto);
    }


    public SaleCarRequestEntity updateExistedSaleCarRequest(String id, SaleCarRequestEntity entity) {
        SaleCarRequestDto dto = saleCarRequestRepository.findById(id).orElseThrow();

        dto.setDate(entity.getDate());
        dto.setStatus(entity.isStatus());
        dto.setCarDto(carRepository.findById(String.valueOf(entity.getUserID())).orElseThrow());
        dto.setUserDto(userRepository.findById(String.valueOf(entity.getUserID())).orElseThrow());
        dto.setShowroomDto(showroomRepository.findById(String.valueOf(entity.getShowroomID())).orElseThrow());

        return SaleCarRequestEntity.fromSaleCarRequestDto(saleCarRequestRepository.save(dto));
    }

    public SaleCarRequestEntity deleteExistedSaleCarRequest(String id) {
        SaleCarRequestDto dto = saleCarRequestRepository.findById(id).orElseThrow();
        saleCarRequestRepository.deleteById(id);
        return SaleCarRequestEntity.fromSaleCarRequestDto(dto);
    }
}
