package com.example.oldcarshowroom.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShowroomRequestEntity {
    private String showroomName;

    private String showroomAddress;

    private String showroomPhone;

    private String showroomAvatar;

    private int userID;
    
}
