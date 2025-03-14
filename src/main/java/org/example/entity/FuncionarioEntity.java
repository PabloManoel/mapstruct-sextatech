package org.example.entity;

import lombok.Data;

import java.util.List;

@Data
public class FuncionarioEntity {

    private Long id;
    private String nome;
    private String funcao;
    private Double salario;
    private DocumentoEntity documento;
    private List<DependenteEntity> dependentes;
}
