package com.example.oldcarshowroom.model.response;

import com.example.oldcarshowroom.model.dto.BuyCarRequestDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BuyCarRequestResponseEntity {

    private int buyCarID;

    private String status;

    private LocalDate  createdDate;

    private LocalDateTime dateTrading;

    private int userID;

    private int carID;

    private int showroomID;

    public static BuyCarRequestResponseEntity fromBuyCarRequestDto(BuyCarRequestDto dto) {
        return BuyCarRequestResponseEntity.builder()
                .buyCarID(dto.getBuyCarID())
                .status(dto.getStatus().toString())
                .createdDate(dto.getCreatedDate())
                .dateTrading(dto.getDateTrading())
                .userID(dto.getUserDto().getUserID())
                .carID(dto.getCarDto().getCarID())
                .showroomID(dto.getShowroomDto().getShowroomID())
                .build();
    }
}
