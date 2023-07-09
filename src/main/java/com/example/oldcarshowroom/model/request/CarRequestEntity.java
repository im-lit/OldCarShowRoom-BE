package com.example.oldcarshowroom.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarRequestEntity {

    private String carAvatar;

    private String carName;

    private int carBrandID;

    private float carPrice;

    private int carTypeID;

    private int yearOfRegistration;

    private int carOdo;

    private String carOrigin;

    private String carDescription;

    private String carCondition;

    private String carStatus;

    private int userID;

    private int showroomID;
    
}
