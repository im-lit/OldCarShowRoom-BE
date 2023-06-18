package com.example.oldcarshowroom.service;

import com.example.oldcarshowroom.model.dto.CarImageDto;
import com.example.oldcarshowroom.model.dto.RoleDto;
import com.example.oldcarshowroom.model.response.CarImageEntity;
import com.example.oldcarshowroom.model.response.RoleEntity;
import com.example.oldcarshowroom.repository.CarImageRepository;
import com.example.oldcarshowroom.repository.CarRepository;
import com.example.oldcarshowroom.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarImageService {

    private final CarImageRepository carImageRepository;

    private final CarRepository carRepository;

    public boolean isExisted(String id) {
        return carImageRepository.existsById(id);
    }

    public CarImageEntity createNewCarImage(CarImageEntity entity) {
        CarImageDto dto = CarImageDto.builder()
                .imageUrl(entity.getImageUrl())
                .carDto(carRepository.findById(String.valueOf(entity.getCarID())).orElseThrow())
                .build();

        return CarImageEntity.fromCarImageDto(carImageRepository.save(dto));
    }

    public List<CarImageEntity> getCarImageByCarID(String carID){
        return carImageRepository.getCarImageByCarID(carID).stream()
                .map(CarImageEntity::fromCarImageDto)
                .collect(Collectors.toList());
    }


    public CarImageEntity updateExistedCarImage(String id, CarImageEntity entity) {
        CarImageDto dto = carImageRepository.findById(id).orElseThrow();


        dto.setImageUrl(entity.getImageUrl());
        dto.setCarDto(carRepository.findById(String.valueOf(entity.getCarID())).orElseThrow());

        return CarImageEntity.fromCarImageDto(carImageRepository.save(dto));
    }

    public CarImageEntity deleteExistedCarImage(String id) {
        CarImageDto dto = carImageRepository.findById(id).orElseThrow();
        carImageRepository.deleteById(id);
        return CarImageEntity.fromCarImageDto(dto);
    }


    public CarImageEntity getCarImageByCarImageID(String id) {
        return CarImageEntity.fromCarImageDto(carImageRepository.getById(id));
    }
}
