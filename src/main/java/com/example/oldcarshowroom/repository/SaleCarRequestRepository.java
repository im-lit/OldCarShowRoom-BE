package com.example.oldcarshowroom.repository;

import com.example.oldcarshowroom.model.dto.SaleCarRequestDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleCarRequestRepository extends JpaRepository<SaleCarRequestDto, Integer> {

    @Query("select dto from SaleCarRequestDto dto where dto.showroomDto.showroomID = ?1")
    List<SaleCarRequestDto> getSaleCarByShowRoomID(int id);

    @Query("select dto from SaleCarRequestDto dto where dto.userDto.userID = ?1")
    List<SaleCarRequestDto> getSaleCarByUserID(int id);

    @Query("select dto from SaleCarRequestDto dto where dto.carDto.carID = ?1")
    List<SaleCarRequestDto> getSaleCarByCarID(int id);
}
