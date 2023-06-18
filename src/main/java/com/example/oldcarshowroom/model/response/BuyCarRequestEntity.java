package com.example.oldcarshowroom.model.response;

import com.example.oldcarshowroom.model.dto.BuyCarRequestDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BuyCarRequestEntity {

    private int buyCarID;

    private boolean status;

    private String date;

    private int userID;

    private int carID;

    private int showroomID;

    public static BuyCarRequestEntity fromBuyCarRequestDto(BuyCarRequestDto dto) {
        return BuyCarRequestEntity.builder()
                .buyCarID(dto.getBuyCarID())
                .status(dto.isStatus())
                .date(dto.getDate())
                .userID(dto.getUserDto().getUserID())
                .carID(dto.getCarDto().getCarID())
                .showroomID(dto.getShowroomDto().getShowroomID())
                .build();
    }
}
