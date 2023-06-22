package com.example.oldcarshowroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oldcarshowroom.model.dto.ShowroomDto;

@Repository

public interface ShowroomRepository extends JpaRepository<ShowroomDto,Integer> {
    
}
