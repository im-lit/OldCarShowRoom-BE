package com.example.oldcarshowroom.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_carbrand")
public class CarBrandDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_brandid")
    private int carBrandID;
    @Column(name = "car_brand_name")
    private String carBrandName;

    private String logoUrl;


}
