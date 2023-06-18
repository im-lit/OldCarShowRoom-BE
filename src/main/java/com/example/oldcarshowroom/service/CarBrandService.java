package com.example.oldcarshowroom.service;

import com.example.oldcarshowroom.model.dto.CarBrandDto;
import com.example.oldcarshowroom.model.response.CarBrandEntity;
import com.example.oldcarshowroom.repository.CarBrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarBrandService {

    private final CarBrandRepository carBrandRepository;



    public CarBrandEntity createNewCarBrand(CarBrandEntity entity) {
        CarBrandDto dto = CarBrandDto.builder()
                .carBrandName(entity.getCarBrandName())
                .logoUrl(entity.getLogoUrl())
                .build();

        return CarBrandEntity.fromCarBrandDto(carBrandRepository.save(dto));
    }

    public List<CarBrandEntity> getAllCarBrands() {
        return carBrandRepository.findAll().stream()
                .map(CarBrandEntity::fromCarBrandDto)
                .collect(Collectors.toList());
    }

    public CarBrandEntity updateExistedCarBrand(int id, CarBrandEntity entity) {
        CarBrandDto dto = carBrandRepository.findById(id).orElseThrow();

        dto.setCarBrandName(entity.getCarBrandName());
        dto.setLogoUrl(entity.getLogoUrl());

        return CarBrandEntity.fromCarBrandDto(carBrandRepository.save(dto));
    }

    public CarBrandEntity deleteExistedCarBrand(int id) {
        CarBrandDto dto = carBrandRepository.findById(id).orElseThrow();
        carBrandRepository.deleteById(id);
        return CarBrandEntity.fromCarBrandDto(dto);
    }


    public CarBrandEntity getCarBrandByCarBrandID(int id) {
        return CarBrandEntity.fromCarBrandDto(carBrandRepository.getById(id));
    }
}
