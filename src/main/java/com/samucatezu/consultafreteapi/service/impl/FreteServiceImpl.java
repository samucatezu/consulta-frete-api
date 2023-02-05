package com.samucatezu.consultafreteapi.service.impl;

import com.samucatezu.consultafreteapi.utils.EstadosEnum;
import com.samucatezu.consultafreteapi.dto.ViaCepDto;
import com.samucatezu.consultafreteapi.request.FreteRequest;
import com.samucatezu.consultafreteapi.response.FreteResponse;
import com.samucatezu.consultafreteapi.service.FreteService;
import com.samucatezu.consultafreteapi.utils.ViaCepClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FreteServiceImpl implements FreteService {
    @Autowired
    private ViaCepClient service;

    @Override
    public FreteResponse freteResponse(FreteRequest freteRequest) throws Exception {

        ViaCepDto viaCepDto = service.buscaCep(freteRequest.getCep());
        if(viaCepDto == null) {
            throw new Exception("Erro ao consultar via cep");
        }
        FreteResponse freteResponse = FreteResponse.builder()
                .cep(viaCepDto.getCep())
                .logradouro(viaCepDto.getLogradouro())
                .complemento(viaCepDto.getComplemento())
                .bairro(viaCepDto.getBairro())
                .localidade(viaCepDto.getLocalidade())
                .uf(viaCepDto.getUf())
                .valorFrete(this.valorFrete(viaCepDto.getUf()))
                .build();

        return freteResponse;
    }

    public String valorFrete(String cep) {
        return EstadosEnum.find(cep);
    }

}
