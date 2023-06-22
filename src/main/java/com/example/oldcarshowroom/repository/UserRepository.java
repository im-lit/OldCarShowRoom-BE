package com.example.oldcarshowroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.oldcarshowroom.model.dto.UserDto;

@Repository
public interface UserRepository extends JpaRepository<UserDto, Integer> {

    @Query("select user from UserDto user where user.userName = ?1 and user.password = ?2")
    UserDto checkLoginUserByUserIdAndPassword(String userName, String password);

}
