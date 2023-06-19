package com.example.oldcarshowroom.model.response;

import com.example.oldcarshowroom.model.dto.CarDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarResponseEntity {
        private int carID;
        
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

        public static CarResponseEntity fromCarDto(CarDto dto) {
            return CarResponseEntity.builder()
                    .carID(dto.getCarID())
                    .carAvatar(dto.getCarAvatar())
                    .carName(dto.getCarName())
                    .carBrandID(dto.getCarBrandDto().getCarBrandID())
                    .carPrice(dto.getCarPrice())
                    .carTypeID(dto.getCarTypeDto().getCarTypeID())
                    .yearOfRegistration(dto.getYearOfRegistration())
                    .carOdo(dto.getCarOdo())
                    .carOrigin(dto.getCarOrigin())
                    .carDescription(dto.getCarDescription())
                    .carCondition(dto.getCarCondition())
                    .carStatus(dto.getCarStatus().toString())
                    .userID(dto.getUserDto().getUserID())
                    .showroomID(dto.getShowroomDto().getShowroomID())
                    .build();
        }

}
