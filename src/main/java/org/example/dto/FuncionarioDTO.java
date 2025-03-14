package org.example.dto;

import lombok.Data;

@Data
public class FuncionarioDTO {

    private String nome;
    private String cargo;
    private Double salario;
    private DocumentoDTO documento;
}
