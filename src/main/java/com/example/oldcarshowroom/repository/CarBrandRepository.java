package com.example.oldcarshowroom.repository;

import com.example.oldcarshowroom.model.dto.CarBrandDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CarBrandRepository extends JpaRepository<CarBrandDto, String> {
}
