package com.example.oldcarshowroom.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oldcarshowroom.model.dto.RoleDto;

@Repository
public interface RoleRepository extends JpaRepository<RoleDto,String> {

}
