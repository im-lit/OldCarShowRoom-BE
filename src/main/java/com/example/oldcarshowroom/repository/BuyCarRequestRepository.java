package com.example.oldcarshowroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.oldcarshowroom.model.dto.BuyCarRequestDto;
import com.example.oldcarshowroom.model.dto.CarDto;

import java.util.List;

@Repository
public interface BuyCarRequestRepository extends JpaRepository<BuyCarRequestDto, Integer> {

    @Query("select dto from BuyCarRequestDto dto where dto.showroomDto.showroomID = ?1")
    List<BuyCarRequestDto> getBuyCarByShowRoomID(int id);

    @Query("select dto from BuyCarRequestDto dto where dto.userDto.userID = ?1")
    List<BuyCarRequestDto> getBuyCarByUserID(int id);

    @Query("select dto from BuyCarRequestDto dto where dto.carDto.carID = ?1")
    List<BuyCarRequestDto> getBuyCarByCarID(int id);


}
