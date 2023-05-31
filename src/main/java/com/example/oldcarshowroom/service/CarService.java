package com.example.oldcarshowroom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.oldcarshowroom.model.dto.CarDto;
import com.example.oldcarshowroom.model.dto.UserDto;
import com.example.oldcarshowroom.model.response.CarEntity;
import com.example.oldcarshowroom.model.response.UserEntity;
import com.example.oldcarshowroom.repository.CarRepository;
import com.example.oldcarshowroom.repository.RoleRepository;
import com.example.oldcarshowroom.repository.ShowroomRepository;
import com.example.oldcarshowroom.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    private final UserRepository userRepository;

    private final ShowroomRepository showroomRepository;

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

    public CarEntity createNewCar(CarEntity entity) {
        CarDto dto = CarDto.builder()
                .carID(entity.getCarID())
                .carName(entity.getCarName())
                .carBrand(entity.getCarBrand())
                .carPrice(entity.getCarPrice())
                .carType(entity.getCarType())
                .yearOfRegistration(entity.getYearOfRegistration())
                .carOdo(entity.getCarOdo())
                .carOrigin(entity.getCarOrigin())
                .carDescription(entity.getCarDescription())
                .carCondition(entity.getCarCondition())
                .carStatus(entity.isCarStatus())
                .userDto(userRepository.findById(entity.getUserID()).orElseThrow())
                .showroomDto(showroomRepository.findById(entity.getShowroomID()).orElseThrow())
                .build();

        return CarEntity.fromCarDto(carRepository.save(dto));
    }


    public CarEntity updateExistedCar(CarEntity entity) {
        CarDto dto = carRepository.findById(entity.getCarID()).orElseThrow();

        dto.setCarName(entity.getCarName());
        dto.setCarBrand(entity.getCarBrand());
        dto.setCarPrice(entity.getCarPrice());
        dto.setCarType(entity.getCarType());
        dto.setYearOfRegistration(entity.getYearOfRegistration());
        dto.setCarOdo(entity.getCarOdo());
        dto.setCarOrigin(entity.getCarOrigin());
        dto.setCarDescription(entity.getCarDescription());
        dto.setCarCondition(entity.getCarCondition());
        dto.setCarStatus(entity.isCarStatus());
        dto.setUserDto(userRepository.findById(entity.getUserID()).orElseThrow());
        dto.setShowroomDto(showroomRepository.findById(entity.getShowroomID()).orElseThrow());

        return CarEntity.fromCarDto(carRepository.save(dto));
    }

    public CarEntity deleteExistedCar(String id) {
        CarDto dto = carRepository.findById(id).orElseThrow();
        carRepository.deleteById(id);
        return CarEntity.fromCarDto(dto);
    }



}
