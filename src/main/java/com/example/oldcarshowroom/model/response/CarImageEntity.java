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
public class CarImageEntity {

    private String carImageID;

    private String imageUrl;

    private String carID;

    public static CarImageEntity fromCarImageDto(CarImageDto dto){
        return CarImageEntity.builder()
                .carImageID(dto.getCarImageID())
                .imageUrl(dto.getImageUrl())
                .carID(dto.getCarDto().getCarID())
                .build();
    }
}
