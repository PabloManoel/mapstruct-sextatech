package org.example.dto;

import lombok.Data;

import java.util.List;

@Data
public class FuncionarioDTO {

    private String nome;
    private String cargo;
    private Double salario;
    private DocumentoDTO documento;
    private List<DependenteDTO> dependentes;
}
