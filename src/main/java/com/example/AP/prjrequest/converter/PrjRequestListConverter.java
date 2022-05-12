package com.example.AP.prjrequest.converter;

import com.example.AP.prjrequest.dto.PrjRequestDto;
import com.example.AP.prjrequest.entity.PrjRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrjRequestListConverter {
    public List<PrjRequestDto> convertToPrjRequestDtoList(List<PrjRequest> prjRequestList) {

        List<PrjRequestDto> prjRequestDtoList = new ArrayList<>();
        for (PrjRequest prjRequest : prjRequestList) {

            PrjRequestDto prjRequestDto = convertToPrjRequestDto(prjRequest);

            prjRequestDtoList.add(prjRequestDto);
        }

        return prjRequestDtoList;
    }


    public PrjRequestDto convertToPrjRequestDto(PrjRequest prjRequest) {
        PrjRequestDto prjRequestDto = new PrjRequestDto();
        prjRequestDto.setStudentId(prjRequest.getStudentId());
        prjRequestDto.setTeacherId(prjRequest.getTeacherId());
        prjRequestDto.setProjectId(prjRequest.getProjectId());

        return prjRequestDto;
    }
}
