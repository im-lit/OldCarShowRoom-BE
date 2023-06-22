package com.example.oldcarshowroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.oldcarshowroom.model.dto.CarDto;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<CarDto, Integer> {

    @Query("select dto from CarDto dto where dto.showroomDto.showroomID = ?1")
    List<CarDto> getCarByShowRoomID(int id);

    @Query("select dto from CarDto dto where dto.userDto.userID = ?1")
    List<CarDto> getCarByUserID(int id);

    @Query("select dto from CarDto dto where dto.carStatus = 'CAN_SALE'")
    List<CarDto> getAllCarCanSale();

    @Query("select dto from CarDto dto where dto.carName like %?1% ")
    List<CarDto> searchCarByCarName(String carName);

    @Query("select dto from CarDto dto where dto.carName like %?1% OR dto.carBrandDto.carBrandName = ?1   ")
    List<CarDto> searchCarByCarNameOrCarBrandName(String name);
    
    @Query("select dto from CarDto dto where dto.carBrandDto.carBrandID = ?1 ")
    List<CarDto> getAllCarCanSaleByBrandId(int brandId);
    
    @Query(value = "SELECT TOP 5 * FROM tbl_car ORDER BY tbl_car.car_price DESC", nativeQuery = true)
    List<CarDto> findTop5MostExpensiveCars();

}
