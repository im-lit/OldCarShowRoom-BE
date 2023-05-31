package com.example.oldcarshowroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.oldcarshowroom.model.dto.UserDto;

@Repository
public interface UserRepository extends JpaRepository<UserDto, String> {

    @Query("select user from UserDto user  where user.userID = ?1 and user.password = ?2")
    UserDto checkLoginUserByUserIdAndPassword(String userID, String password);

}
