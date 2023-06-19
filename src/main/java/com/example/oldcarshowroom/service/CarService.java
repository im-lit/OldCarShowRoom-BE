package com.example.oldcarshowroom.service;

import com.example.oldcarshowroom.model.request.CarRequestEntity;
import com.example.oldcarshowroom.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.oldcarshowroom.model.dto.CarDto;
import com.example.oldcarshowroom.model.response.CarResponseEntity;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    private final UserRepository userRepository;

    private final ShowroomRepository showroomRepository;

    private final CarBrandRepository carBrandRepository;

    private final CarTypeRepository carTypeRepository;



    public CarResponseEntity getCarByCarID(int id) {
        return CarResponseEntity.fromCarDto(carRepository.getById(id));
    }

    public List<CarResponseEntity> getCarByShowroomID(int id) {
        return carRepository.getCarByShowRoomID(id).stream()
                .map(CarResponseEntity::fromCarDto)
                .collect(Collectors.toList());
    }

    public List<CarResponseEntity> getCarByUserID(int id) {
        return carRepository.getCarByUserID(id).stream()
                .map(CarResponseEntity::fromCarDto)
                .collect(Collectors.toList());
    }

    public List<CarResponseEntity> getAllCarCanSale() {
        return carRepository.getAllCarCanSale().stream()
                .map(CarResponseEntity::fromCarDto)
                .collect(Collectors.toList());
    }

    public CarResponseEntity createNewCar(CarRequestEntity entity) {
        CarDto dto = CarDto.builder()
                .carName(entity.getCarName())
                .carBrandDto(carBrandRepository.findById(entity.getCarBrandID()).orElseThrow())
                .carPrice(entity.getCarPrice())
                .carTypeDto(carTypeRepository.findById(entity.getCarTypeID()).orElseThrow())
                .yearOfRegistration(entity.getYearOfRegistration())
                .carOdo(entity.getCarOdo())
                .carOrigin(entity.getCarOrigin())
                .carDescription(entity.getCarDescription())
                .carCondition(entity.getCarCondition())
                .carStatus(CarDto.CarStatus.valueOf(entity.getCarStatus()))
                .userDto(userRepository.findById(entity.getUserID()).orElseThrow())
                .showroomDto(showroomRepository.findById(entity.getShowroomID()).orElseThrow())
                .build();

        return CarResponseEntity.fromCarDto(carRepository.save(dto));
    }


    public CarResponseEntity updateExistedCar(int id, CarRequestEntity entity) {
        CarDto dto = carRepository.findById(id).orElseThrow();

        dto.setCarName(entity.getCarName());
        dto.setCarBrandDto(carBrandRepository.findById(entity.getCarBrandID()).orElseThrow());
        dto.setCarPrice(entity.getCarPrice());
        dto.setCarTypeDto(carTypeRepository.findById(entity.getCarTypeID()).orElseThrow());
        dto.setYearOfRegistration(entity.getYearOfRegistration());
        dto.setCarOdo(entity.getCarOdo());
        dto.setCarOrigin(entity.getCarOrigin());
        dto.setCarDescription(entity.getCarDescription());
        dto.setCarCondition(entity.getCarCondition());
        dto.setCarStatus(CarDto.CarStatus.valueOf(entity.getCarStatus()));
        dto.setUserDto(userRepository.findById(entity.getUserID()).orElseThrow());
        dto.setShowroomDto(showroomRepository.findById(entity.getShowroomID()).orElseThrow());

        return CarResponseEntity.fromCarDto(carRepository.save(dto));
    }

    public CarResponseEntity deleteExistedCar(int id) {
        CarDto dto = carRepository.findById(id).orElseThrow();
        carRepository.deleteById(id);
        return CarResponseEntity.fromCarDto(dto);
    }




}
