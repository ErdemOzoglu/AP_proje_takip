package com.example.AP.teacher.controller;

import com.example.AP.teacher.dto.TeacherDto;
import com.example.AP.gen.dto.RestResponse;
import com.example.AP.teacher.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;

    @PostMapping
    public ResponseEntity save(@RequestBody TeacherDto teacherDto){

        teacherDto = teacherService.save(teacherDto);

        return ResponseEntity.ok(RestResponse.of(teacherDto));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){

        teacherService.delete(id);

        return ResponseEntity.ok(RestResponse.empty());
    }


}
