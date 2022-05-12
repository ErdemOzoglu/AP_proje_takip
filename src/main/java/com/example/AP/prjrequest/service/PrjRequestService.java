package com.example.AP.prjrequest.service;

import com.example.AP.prjrequest.converter.PrjRequestConverter;
import com.example.AP.prjrequest.converter.PrjRequestListConverter;
import com.example.AP.prjrequest.dto.PrjRequestDto;
import com.example.AP.prjrequest.entity.PrjRequest;
import com.example.AP.prjrequest.service.entityservice.PrjRequestEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrjRequestService {

    private final PrjRequestEntityService prjRequestEntityService;
    private final PrjRequestListConverter prjRequestListConverter;

    public PrjRequestDto save(PrjRequestDto prjRequestDto){

        PrjRequest prjRequest = PrjRequestConverter.INSTANCE.convertToPrjRequest(prjRequestDto);

        prjRequest = prjRequestEntityService.save(prjRequest);

        prjRequestDto = PrjRequestConverter.INSTANCE.convertToPrjRequestDto(prjRequest);

        return prjRequestDto;
    }


    public void delete(Long id) {

        PrjRequest prjRequest = prjRequestEntityService.getByIdWithControl(id);

        prjRequestEntityService.delete(prjRequest);
    }

    public List<PrjRequestDto> findAll() {

        List<PrjRequest> prjRequestList = prjRequestEntityService.findAll();

        List<PrjRequestDto> prjRequestDtoList  = prjRequestListConverter.convertToPrjRequestDtoList(prjRequestList);

        return prjRequestDtoList;
    }

    public List<PrjRequestDto> findAllByTeacherId(Long teacherId){

        List<PrjRequest> prjRequestList = prjRequestEntityService.findAllByTeacherId(teacherId);

        List<PrjRequestDto> prjRequestDtoList = prjRequestListConverter.convertToPrjRequestDtoList(prjRequestList);

        return prjRequestDtoList;
    }

}
