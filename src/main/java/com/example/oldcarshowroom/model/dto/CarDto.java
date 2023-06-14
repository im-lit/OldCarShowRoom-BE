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
@Table(name = "tbl_car")
public class CarDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String carID;
    @Column(name = "car_name", columnDefinition = "nvarchar(250)", nullable = true)
    private String carName;

    //private String carBrand;

    private float carPrice;

    // private String carType;

    private int yearOfRegistration;

    private int carOdo;
    
    @Column(name = "car_origin", columnDefinition = "nvarchar(50)", nullable = true)
    private String carOrigin;
    
    @Column(name = "car_description", columnDefinition = "nvarchar(255)", nullable = true)
    private String carDescription;
    
    @Column(name = "car_condition", columnDefinition = "nvarchar(50)", nullable = true)
    private String carCondition;
    
    @Enumerated(EnumType.STRING)
    private CarStatus carStatus;
    
    private String carAvatar;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userID")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private UserDto userDto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "showroomID")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private ShowroomDto showroomDto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carBrandID")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private CarBrandDto carBrandDto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carTypeID")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private CarTypeDto carTypeDto;

    public enum CarStatus{
       CAN_NOT_SALE, CAN_SALE, ON_SALE
    }
}
