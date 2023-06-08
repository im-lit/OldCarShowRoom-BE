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
public class CarBrandEntity {
    private String carBrandID;

    private String carBrandName;

    private String logoUrl;

    public static CarBrandEntity fromCarBrandDto(CarBrandDto dto) {
        return CarBrandEntity.builder()
                .carBrandID(dto.getCarBrandID())
                .carBrandName(dto.getCarBrandName())
                .logoUrl(dto.getLogoUrl())
                .build();
    }

}
