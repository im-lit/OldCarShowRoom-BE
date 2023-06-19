package com.example.oldcarshowroom.model.response;

import com.example.oldcarshowroom.model.dto.ShowroomDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShowroomResponseEntity {
    private int showroomID;

    private String showroomName;

    private String showroomAddress;
    
    private String showroomDescription;

    private String showroomPhone;
    
    private String showroomAvatar;

    private int userID;

    public static ShowroomResponseEntity fromShowroomDto(ShowroomDto dto) {
        return ShowroomResponseEntity.builder()
                .showroomID(dto.getShowroomID())
                .showroomAvatar(dto.getShowroomAvatar())
                .showroomDescription(dto.getShowroomDescription())
                .showroomName(dto.getShowroomName())
                .showroomAddress(dto.getShowroomAddress())
                .showroomPhone(dto.getShowroomPhone())
                .userID(dto.getUserDto().getUserID())
                .build();
    }

}
