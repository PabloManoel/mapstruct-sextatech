package org.example.mapper;

import org.example.dto.FuncionarioDTO;
import org.example.entity.FuncionarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FuncionarioMapper {

    FuncionarioMapper INSTANCE = Mappers.getMapper(FuncionarioMapper.class);

    @Mapping(source = "cargo", target = "funcao")
    FuncionarioEntity toEntity(FuncionarioDTO funcionarioDTO);

    @Mapping(source = "funcao", target = "cargo")
    FuncionarioDTO toDTO(FuncionarioEntity funcionarioEntity);
}
