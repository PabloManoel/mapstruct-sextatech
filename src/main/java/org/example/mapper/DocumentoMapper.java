package org.example.mapper;

import org.example.dto.DocumentoDTO;
import org.example.dto.FuncionarioDTO;
import org.example.entity.DocumentoEntity;
import org.example.entity.FuncionarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DocumentoMapper {

    DocumentoMapper INSTANCE = Mappers.getMapper(DocumentoMapper.class);

    @Mapping(source = "rg", target = "rg", qualifiedByName = "removeFormatacaoRG")
    @Mapping(expression = "java(mapCPFFormatado(documentoDTO))", target="cpf")
    DocumentoEntity toEntity(DocumentoDTO documentoDTO);

    DocumentoDTO toDTO(DocumentoEntity documentoEntity);

    @Named("removeFormatacaoRG")
    default String mapRGFormatado(String rg) {
        return rg.replaceAll("[^0-9]", ""); // Remove tudo que não for número
    }
    default String mapCPFFormatado(DocumentoDTO documentoDTO) {
        return documentoDTO.getCpf().replaceAll("[^0-9]", ""); // Remove tudo que não for número
    }
}
