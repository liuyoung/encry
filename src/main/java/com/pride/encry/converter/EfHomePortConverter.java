package com.pride.encry.converter;

import com.pride.encry.domain.EfHomePort;
import com.pride.encry.dto.EfHomePortDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EfHomePortConverter {

    EfHomePortConverter INSTANCE = Mappers.getMapper(EfHomePortConverter.class);

    /**
     * DTO转换成实体类
     *
     * @param item
     * @return
     */
    @Mapping(source = "name", target = "name")
    EfHomePort convert(EfHomePortDTO item);

    /**
     * 实体类转换成DTO
     *
     * @param item
     * @return
     */
    EfHomePortDTO convertDTO(EfHomePort item);

    /**
     * DTO转换成实体类
     *
     * @param list
     * @return
     */
    List<EfHomePort> convert(List<EfHomePortDTO> list);

    /**
     * 实体类转换成DTO
     *
     * @param list
     * @return
     */
    List<EfHomePortDTO> convertDTO(List<EfHomePort> list);

}
