package com.example.oldcarshowroom.model.response;

import com.example.oldcarshowroom.model.dto.CarImageDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarImageResponseEntity {

    private int carImageID;

    private String imageUrl;

    private int carID;

    public static CarImageResponseEntity fromCarImageDto(CarImageDto dto){
        return CarImageResponseEntity.builder()
                .carImageID(dto.getCarImageID())
                .imageUrl(dto.getImageUrl())
                .carID(dto.getCarDto().getCarID())
                .build();
    }
}
