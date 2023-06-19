package com.example.oldcarshowroom.model.response;

import com.example.oldcarshowroom.model.dto.CarBrandDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarBrandResponseEntity {
    private int carBrandID;

    private String carBrandName;

    private String logoUrl;

    public static CarBrandResponseEntity fromCarBrandDto(CarBrandDto dto) {
        return CarBrandResponseEntity.builder()
                .carBrandID(dto.getCarBrandID())
                .carBrandName(dto.getCarBrandName())
                .logoUrl(dto.getLogoUrl())
                .build();
    }

}
