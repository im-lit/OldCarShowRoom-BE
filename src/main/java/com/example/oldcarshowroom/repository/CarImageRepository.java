package com.example.oldcarshowroom.repository;

import com.example.oldcarshowroom.model.dto.CarImageDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarImageRepository extends JpaRepository<CarImageDto, String > {

    @Query("select dto from CarImageDto dto where dto.carDto.carID = ?1")
    List<CarImageDto> getCarImageByCarID(String id);
}
