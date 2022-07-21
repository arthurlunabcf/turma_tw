package com.web.aulaweb.domain.resource;

import lombok.Data;

@Data
public class AlunoRequest {
    String nome;
    Integer idade;
    String endereco;
}