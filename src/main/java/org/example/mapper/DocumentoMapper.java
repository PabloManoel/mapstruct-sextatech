package org.example.mapper;

import org.example.dto.DocumentoDTO;
import org.example.dto.FuncionarioDTO;
import org.example.entity.DocumentoEntity;
import org.example.entity.FuncionarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DocumentoMapper {

    DocumentoMapper INSTANCE = Mappers.getMapper(DocumentoMapper.class);

    DocumentoEntity toEntity(DocumentoDTO funcionarioDTO);

    DocumentoDTO toDTO(DocumentoEntity funcionarioEntity);
}
