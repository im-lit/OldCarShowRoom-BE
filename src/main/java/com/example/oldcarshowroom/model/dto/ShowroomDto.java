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
@Table(name = "tbl_showroom")
public class ShowroomDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "showroomid")
    private int showroomID;
  
    @Column(name = "showroom_name", columnDefinition = "nvarchar(255)", nullable = true)
    private String showroomName;
    
    @Column(name = "showroom_address", columnDefinition = "nvarchar(255)", nullable = true)
    private String showroomAddress;
    
    @Column(name = "showroom_avatar", columnDefinition = "varchar(500)", nullable = true)
    private String showroomAvatar;

    private String showroomPhone;
    
    @Column(name = "showroom_description", columnDefinition = "nvarchar(255)", nullable = true)
    private String showroomDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userID")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private UserDto userDto;
}
