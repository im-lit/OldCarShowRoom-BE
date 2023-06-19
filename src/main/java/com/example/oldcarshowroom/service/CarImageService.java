package com.example.oldcarshowroom.service;

import com.example.oldcarshowroom.model.dto.CarImageDto;
import com.example.oldcarshowroom.model.request.CarImageRequestEntity;
import com.example.oldcarshowroom.model.response.CarImageResponseEntity;
import com.example.oldcarshowroom.repository.CarImageRepository;
import com.example.oldcarshowroom.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarImageService {

    private final CarImageRepository carImageRepository;

    private final CarRepository carRepository;



    public CarImageResponseEntity createNewCarImage(CarImageRequestEntity entity) {
        CarImageDto dto = CarImageDto.builder()
                .imageUrl(entity.getImageUrl())
                .carDto(carRepository.findById(entity.getCarID()).orElseThrow())
                .build();

        return CarImageResponseEntity.fromCarImageDto(carImageRepository.save(dto));
    }

    public List<CarImageResponseEntity> getCarImageByCarID(int carID){
        return carImageRepository.getCarImageByCarID(carID).stream()
                .map(CarImageResponseEntity::fromCarImageDto)
                .collect(Collectors.toList());
    }


    public CarImageResponseEntity updateExistedCarImage(int id, CarImageRequestEntity entity) {
        CarImageDto dto = carImageRepository.findById(id).orElseThrow();


        dto.setImageUrl(entity.getImageUrl());
        dto.setCarDto(carRepository.findById(entity.getCarID()).orElseThrow());

        return CarImageResponseEntity.fromCarImageDto(carImageRepository.save(dto));
    }

    public CarImageResponseEntity deleteExistedCarImage(int id) {
        CarImageDto dto = carImageRepository.findById(id).orElseThrow();
        carImageRepository.deleteById(id);
        return CarImageResponseEntity.fromCarImageDto(dto);
    }


    public CarImageResponseEntity getCarImageByCarImageID(int id) {
        return CarImageResponseEntity.fromCarImageDto(carImageRepository.getById(id));
    }
}
