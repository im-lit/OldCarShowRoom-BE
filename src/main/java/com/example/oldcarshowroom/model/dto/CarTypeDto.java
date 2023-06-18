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
@Table(name = "tbl_cartype")
public class CarTypeDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int carTypeID;

    private String carTypeName;
}
