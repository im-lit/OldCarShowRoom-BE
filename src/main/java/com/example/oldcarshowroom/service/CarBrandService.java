package com.example.oldcarshowroom.service;

import com.example.oldcarshowroom.model.dto.CarBrandDto;
import com.example.oldcarshowroom.model.request.CarBrandRequestEntity;
import com.example.oldcarshowroom.model.response.CarBrandResponseEntity;
import com.example.oldcarshowroom.repository.CarBrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarBrandService {

    private final CarBrandRepository carBrandRepository;


    public CarBrandResponseEntity createNewCarBrand(CarBrandRequestEntity entity) {
        CarBrandDto dto = CarBrandDto.builder()
                .carBrandName(entity.getCarBrandName())
                .logoUrl(entity.getLogoUrl())
                .build();
        return CarBrandResponseEntity.fromCarBrandDto(carBrandRepository.save(dto));
    }

    public List<CarBrandResponseEntity> getAllCarBrands() {
        return carBrandRepository.findAll().stream()
                .map(CarBrandResponseEntity::fromCarBrandDto)
                .collect(Collectors.toList());
    }

    public CarBrandResponseEntity updateExistedCarBrand(int id, CarBrandRequestEntity entity) {
        CarBrandDto dto = carBrandRepository.findById(id).orElseThrow();

        dto.setCarBrandName(entity.getCarBrandName());
        dto.setLogoUrl(entity.getLogoUrl());

        return CarBrandResponseEntity.fromCarBrandDto(carBrandRepository.save(dto));
    }

    public CarBrandResponseEntity deleteExistedCarBrand(int id) {
        CarBrandDto dto = carBrandRepository.findById(id).orElseThrow();
        carBrandRepository.deleteById(id);
        return CarBrandResponseEntity.fromCarBrandDto(dto);
    }


    public CarBrandResponseEntity getCarBrandByCarBrandID(int id) {
        return CarBrandResponseEntity.fromCarBrandDto(carBrandRepository.getById(id));
    }
}
