package org.example.entity;

import lombok.Data;

@Data
public class FuncionarioEntity {

    private Long id;
    private String nome;
    private String funcao;
    private Double salario;
    private DocumentoEntity documento;
}
