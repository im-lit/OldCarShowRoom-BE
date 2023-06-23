package com.example.oldcarshowroom.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaleCarRequestRequestEntity {

    private String status;

    private String dateTrading;

    private int userID;

    private int carID;

    private int showroomID;
}
