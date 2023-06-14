package com.example.oldcarshowroom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.oldcarshowroom.model.dto.CarDto;
import com.example.oldcarshowroom.model.dto.ShowroomDto;

@Repository

public interface ShowroomRepository extends JpaRepository<ShowroomDto,String> {
    
}
