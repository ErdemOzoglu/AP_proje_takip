package com.example.AP.project.service;

import com.example.AP.project.converter.ProjectConverter;
import com.example.AP.project.dto.ProjectDto;
import com.example.AP.project.entity.Project;
import com.example.AP.project.service.entityservice.ProjectEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectEntityService projectEntityService;

    public ProjectDto save(ProjectDto projectDto){

        Project project = ProjectConverter.INSTANCE.convertToProject(projectDto);

        project = projectEntityService.save(project);

        ProjectDto projectDto1 = ProjectConverter.INSTANCE.convertToProjectDto(project);

        return projectDto1;
    }

    public void delete(Long id) {

        Project project = projectEntityService.getByIdWithControl(id);

        projectEntityService.delete(project);
    }

}
