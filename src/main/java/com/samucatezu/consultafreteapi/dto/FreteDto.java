package com.samucatezu.consultafreteapi.dto;

import com.samucatezu.consultafreteapi.model.Frete;

public class FreteDto {

    private Double valorFrete;

    private String cepDestino;

    public FreteDto(Frete frete) {
        valorFrete = frete.getValorFrete();
        cepDestino = frete.getCepDestino();
    }
}
