package com.example.AP.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectDto {

    private String projectName;
    private String description;
    private Long  teacher;

}
