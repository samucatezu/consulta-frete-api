package com.samucatezu.consultafreteapi.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class FreteResponse {

    private String cep;
    @JsonProperty("estado")
    private String uf;
    private String ddd;
    @JsonProperty("rua")
    private String logradouro;
    private String bairro;
    private String complemento;
    @JsonProperty("cidade")
    private String localidade;
    @JsonProperty("frete")
    private String valorFrete;


}
