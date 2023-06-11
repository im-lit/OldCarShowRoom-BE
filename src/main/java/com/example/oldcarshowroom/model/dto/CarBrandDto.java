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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String carBrandID;

    private String carBrandName;

    private String logoUrl;


}
