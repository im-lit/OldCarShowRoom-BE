package com.example.oldcarshowroom.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarImage {

    private String carImageID;

    private String imageUrl;

    private String carID;


}
