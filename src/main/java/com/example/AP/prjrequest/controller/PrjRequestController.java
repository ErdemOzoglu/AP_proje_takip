package com.example.AP.prjrequest.controller;

import com.example.AP.gen.dto.RestResponse;
import com.example.AP.prjrequest.dto.PrjRequestDto;
import com.example.AP.prjrequest.service.PrjRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/prjrequest")
@RequiredArgsConstructor
public class PrjRequestController {
    private final PrjRequestService prjRequestService;


    @PostMapping
    public ResponseEntity save(@RequestBody PrjRequestDto prjRequestDto){

         prjRequestDto = prjRequestService.save(prjRequestDto);

        return ResponseEntity.ok(RestResponse.of(prjRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){

        prjRequestService.delete(id);

        return ResponseEntity.ok(RestResponse.empty());
    }

    @GetMapping
    public ResponseEntity findAll(){

        List<PrjRequestDto> prjRequestDtoList = prjRequestService.findAll();

        return ResponseEntity.ok(RestResponse.of(prjRequestDtoList));
    }

    @GetMapping("/{teacherId}")
    public  ResponseEntity findAllByTeacherId(@PathVariable Long teacherId){

        List<PrjRequestDto> prjRequestDtoList = prjRequestService.findAllByTeacherId(teacherId);

        return ResponseEntity.ok(RestResponse.of(prjRequestDtoList));
    }
}
