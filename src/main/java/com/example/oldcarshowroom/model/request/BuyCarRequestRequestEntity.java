package com.example.oldcarshowroom.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BuyCarRequestRequestEntity {

    private String status;

//    private LocalDate createdDate;

    private String dateTrading;

    private int userID;

    private int carID;

    private int showroomID;

}
