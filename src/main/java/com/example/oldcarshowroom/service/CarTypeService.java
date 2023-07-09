package com.example.oldcarshowroom.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.oldcarshowroom.model.dto.CarTypeDto;
import com.example.oldcarshowroom.model.request.CarTypeRequestEntity;
import com.example.oldcarshowroom.model.response.CarTypeResponseEntity;
import com.example.oldcarshowroom.repository.CarTypeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CarTypeService {
    private final CarTypeRepository carTypeRepository;



    public CarTypeResponseEntity createNewCarType(CarTypeRequestEntity entity) {
        CarTypeDto dto = CarTypeDto.builder()
                .carTypeName(entity.getCarTypeName())
                .build();

        return CarTypeResponseEntity.fromCarTypeDto(carTypeRepository.save(dto));
    }

    public List<CarTypeResponseEntity> getAllCarTypes() {
        return carTypeRepository.findAll().stream()
                .map(CarTypeResponseEntity::fromCarTypeDto)
                .collect(Collectors.toList());
    }

    public CarTypeResponseEntity updateExistedCarType(int id, CarTypeRequestEntity entity) {
        CarTypeDto dto = carTypeRepository.findById(id).orElseThrow();


        dto.setCarTypeName(entity.getCarTypeName());

        return CarTypeResponseEntity.fromCarTypeDto(carTypeRepository.save(dto));
    }

    public CarTypeResponseEntity deleteExistedCarType(int id) {
        CarTypeDto dto = carTypeRepository.findById(id).orElseThrow();
        carTypeRepository.deleteById(id);
        return CarTypeResponseEntity.fromCarTypeDto(dto);
    }


    public CarTypeResponseEntity getCarTypeByCarTypeID(int id) {
        return CarTypeResponseEntity.fromCarTypeDto(carTypeRepository.getById(id));
    }
}
