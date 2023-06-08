package com.example.oldcarshowroom.service;

import com.example.oldcarshowroom.model.dto.CarTypeDto;
import com.example.oldcarshowroom.model.response.CarTypeEntity;
import com.example.oldcarshowroom.repository.CarTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarTypeService {
    private final CarTypeRepository carTypeRepository;

    public boolean isExisted(String id) {
        return carTypeRepository.existsById(id);
    }

    public CarTypeEntity createNewCarType(CarTypeEntity entity) {
        CarTypeDto dto = CarTypeDto.builder()
                .carTypeID(entity.getCarTypeID())
                .carTypeName(entity.getCarTypeName())
                .build();

        return CarTypeEntity.fromCarTypeDto(carTypeRepository.save(dto));
    }

    public List<CarTypeEntity> getAllCarTypes() {
        return carTypeRepository.findAll().stream()
                .map(CarTypeEntity::fromCarTypeDto)
                .collect(Collectors.toList());
    }

    public CarTypeEntity updateExistedCarType(CarTypeEntity entity) {
        CarTypeDto dto = carTypeRepository.findById(entity.getCarTypeID()).orElseThrow();

        dto.setCarTypeID(entity.getCarTypeID());
        dto.setCarTypeName(entity.getCarTypeName());

        return CarTypeEntity.fromCarTypeDto(carTypeRepository.save(dto));
    }

    public CarTypeEntity deleteExistedCarType(String id) {
        CarTypeDto dto = carTypeRepository.findById(id).orElseThrow();
        carTypeRepository.deleteById(id);
        return CarTypeEntity.fromCarTypeDto(dto);
    }


    public CarTypeEntity getCarTypeByCarTypeID(String id) {
        return CarTypeEntity.fromCarTypeDto(carTypeRepository.getById(id));
    }
}
