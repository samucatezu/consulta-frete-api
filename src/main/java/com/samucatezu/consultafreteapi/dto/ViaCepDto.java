package com.samucatezu.consultafreteapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ViaCepDto {

    private String cep;
    private String uf;
    private String ddd;
    private String logradouro;
    private String bairro;
    private String complemento;
    private String cidade;
}
