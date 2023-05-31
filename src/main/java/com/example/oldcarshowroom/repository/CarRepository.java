package com.example.oldcarshowroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.oldcarshowroom.model.dto.CarDto;
import com.example.oldcarshowroom.model.dto.UserDto;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<CarDto, String> {

    @Query("select dto from CarDto dto where dto.showroomDto.showroomID = ?1")
    List<CarDto> getCarByShowRoomID(String id);

    @Query("select dto from CarDto dto where dto.userDto.userID = ?1")
    List<CarDto> getCarByUserID(String id);
}
