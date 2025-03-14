package org.example.mapper;

import org.example.dto.FuncionarioDTO;
import org.example.entity.FuncionarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FuncionarioMapper {

    FuncionarioMapper INSTANCE = Mappers.getMapper(FuncionarioMapper.class);

    FuncionarioEntity toEntity(FuncionarioDTO funcionarioDTO);

    FuncionarioDTO toDTO(FuncionarioEntity funcionarioEntity);
}
