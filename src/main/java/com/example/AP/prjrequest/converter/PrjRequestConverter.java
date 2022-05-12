package com.example.AP.prjrequest.converter;

import com.example.AP.prjrequest.dto.PrjRequestDto;
import com.example.AP.prjrequest.entity.PrjRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PrjRequestConverter {

    PrjRequestConverter INSTANCE = Mappers.getMapper(PrjRequestConverter.class);

    PrjRequest convertToPrjRequest(PrjRequestDto prjRequestDto);
    PrjRequestDto convertToPrjRequestDto(PrjRequest prjRequest);
}
