package com.example.AP.prjrequest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PrjRequestDto {

    private Long studentId;
    private Long teacherId;
    private Long projectId;
}
