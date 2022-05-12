package com.example.AP.project.converter;

import com.example.AP.project.dto.ProjectDto;
import com.example.AP.project.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProjectConverter {

    ProjectConverter INSTANCE = Mappers.getMapper(ProjectConverter.class);

    ProjectDto convertToProjectDto(Project project);
    Project convertToProject(ProjectDto projectDto);
}
