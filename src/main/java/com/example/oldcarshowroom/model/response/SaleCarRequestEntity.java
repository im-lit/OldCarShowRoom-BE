package com.example.oldcarshowroom.model.response;

import com.example.oldcarshowroom.model.dto.SaleCarRequestDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaleCarRequestEntity {

    private String saleCarID;

    private boolean status;

    private String date;

    private String userID;

    private String carID;

    private String showroomID;

    public static SaleCarRequestEntity fromSaleCarRequestDto(SaleCarRequestDto dto) {
        return SaleCarRequestEntity.builder()
                .saleCarID(dto.getSaleCarID())
                .status(dto.isStatus())
                .date(dto.getDate())
                .userID(dto.getUserDto().getUserID())
                .carID(dto.getCarDto().getCarID())
                .showroomID(dto.getShowroomDto().getShowroomID())
                .build();
    }
}
