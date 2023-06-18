package com.example.oldcarshowroom.repository;

import com.example.oldcarshowroom.model.dto.CarTypeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarTypeRepository extends JpaRepository<CarTypeDto, Integer> {

}
