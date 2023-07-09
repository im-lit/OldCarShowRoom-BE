package com.example.oldcarshowroom.model.response;

import com.example.oldcarshowroom.model.dto.CarTypeDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarTypeResponseEntity {

    private int carTypeID;

    private String carTypeName;

    public static CarTypeResponseEntity fromCarTypeDto(CarTypeDto dto) {
        return CarTypeResponseEntity.builder()
                .carTypeID(dto.getCarTypeID())
                .carTypeName(dto.getCarTypeName())
                .build();
    }

}
