package com.example.AP.project.controller;

import com.example.AP.gen.dto.RestResponse;
import com.example.AP.project.dto.ProjectDto;
import com.example.AP.project.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @PostMapping
    public ResponseEntity save(@RequestBody ProjectDto projectDto){

        ProjectDto projectDto1 = projectService.save(projectDto);

        return ResponseEntity.ok(RestResponse.of(projectDto1));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){

        projectService.delete(id);

        return ResponseEntity.ok(RestResponse.empty());
    }
}
