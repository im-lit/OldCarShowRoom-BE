package com.example.oldcarshowroom.service;

import com.example.oldcarshowroom.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.oldcarshowroom.model.dto.CarDto;
import com.example.oldcarshowroom.model.dto.UserDto;
import com.example.oldcarshowroom.model.response.CarEntity;
import com.example.oldcarshowroom.model.response.UserEntity;

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

    public boolean isExisted(String id) {
        return carRepository.existsById(id);
    }

    public CarEntity getCarByCarID(String id) {
        return CarEntity.fromCarDto(carRepository.getById(id));
    }

    public List<CarEntity> getCarByShowroomID(String id) {
        return carRepository.getCarByShowRoomID(id).stream()
                .map(CarEntity::fromCarDto)
                .collect(Collectors.toList());
    }

    public List<CarEntity> getCarByUserID(String id) {
        return carRepository.getCarByUserID(id).stream()
                .map(CarEntity::fromCarDto)
                .collect(Collectors.toList());
    }

    public List<CarEntity> getAllCarCanSale() {
        return carRepository.getAllCarCanSale().stream()
                .map(CarEntity::fromCarDto)
                .collect(Collectors.toList());
    }

    public CarEntity createNewCar(CarEntity entity) {
        CarDto dto = CarDto.builder()
                .carName(entity.getCarName())
                .carBrandDto(carBrandRepository.findById(String.valueOf(entity.getCarBrandID())).orElseThrow())
                .carPrice(entity.getCarPrice())
                .carTypeDto(carTypeRepository.findById(String.valueOf(entity.getCarTypeID())).orElseThrow())
                .yearOfRegistration(entity.getYearOfRegistration())
                .carOdo(entity.getCarOdo())
                .carOrigin(entity.getCarOrigin())
                .carDescription(entity.getCarDescription())
                .carCondition(entity.getCarCondition())
                .carStatus(CarDto.CarStatus.valueOf(entity.getCarStatus()))
                .userDto(userRepository.findById(String.valueOf(entity.getUserID())).orElseThrow())
                .showroomDto(showroomRepository.findById(String.valueOf(entity.getShowroomID())).orElseThrow())
                .build();

        return CarEntity.fromCarDto(carRepository.save(dto));
    }


    public CarEntity updateExistedCar(String id, CarEntity entity) {
        CarDto dto = carRepository.findById(id).orElseThrow();

        dto.setCarName(entity.getCarName());
        dto.setCarBrandDto(carBrandRepository.findById(String.valueOf(entity.getCarBrandID())).orElseThrow());
        dto.setCarPrice(entity.getCarPrice());
        dto.setCarTypeDto(carTypeRepository.findById(String.valueOf(entity.getCarTypeID())).orElseThrow());
        dto.setYearOfRegistration(entity.getYearOfRegistration());
        dto.setCarOdo(entity.getCarOdo());
        dto.setCarOrigin(entity.getCarOrigin());
        dto.setCarDescription(entity.getCarDescription());
        dto.setCarCondition(entity.getCarCondition());
        dto.setCarStatus(CarDto.CarStatus.valueOf(entity.getCarStatus()));
        dto.setUserDto(userRepository.findById(String.valueOf(entity.getUserID())).orElseThrow());
        dto.setShowroomDto(showroomRepository.findById(String.valueOf(entity.getShowroomID())).orElseThrow());

        return CarEntity.fromCarDto(carRepository.save(dto));
    }

    public CarEntity deleteExistedCar(String id) {
        CarDto dto = carRepository.findById(id).orElseThrow();
        carRepository.deleteById(id);
        return CarEntity.fromCarDto(dto);
    }




}
