package com.example.oldcarshowroom.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_user")
public class UserDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private int userID;

    private String userName;

    private String password;
    
    @Column(name = "full_name", columnDefinition = "nvarchar(255)", nullable = true)
    private String fullName;

    private String phone;
    	
    @Column(name = "address", columnDefinition = "nvarchar(255)", nullable = true)
    private String address;

    private String avatarUrl;

    private boolean status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleID")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private RoleDto roleDto;



}
