package com.example.AP.student.controller;

import com.example.AP.gen.dto.RestResponse;
import com.example.AP.student.dto.StudentDto;
import com.example.AP.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity save(@RequestBody StudentDto studentDto){

        StudentDto studentDto1 = studentService.save(studentDto);

        return ResponseEntity.ok(RestResponse.of(studentDto1));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){

        studentService.delete(id);

        return ResponseEntity.ok(RestResponse.empty());
    }

}
