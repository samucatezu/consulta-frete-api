package com.samucatezu.consultafreteapi.service;

import com.samucatezu.consultafreteapi.model.FreteModel;
import com.samucatezu.consultafreteapi.request.FreteRequest;
import com.samucatezu.consultafreteapi.response.FreteResponse;
import com.samucatezu.consultafreteapi.utils.EstadosEnum;
import com.samucatezu.consultafreteapi.validation.exception.CepNaoEncontradoException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class FreteService {

    public String executa(FreteRequest request) {
        try{

            FreteResponse freteResponse = new RestTemplate().getForEntity("https://viacep.com.br/ws/" + request.getCep() + "/json/", FreteResponse.class).getBody();

            if (freteResponse != null && freteResponse.isErro()) {
                throw new CepNaoEncontradoException("CEP não encontrado, por favor repetir a consulta com dados válidos.");
            }

            FreteModel freteModel = new FreteModel(freteResponse);

            return freteModel.toString();

        } catch (HttpClientErrorException.BadRequest ex) {
            return "CEP inválido, por favor repetir a consulta com dados válidos.";
        }

    }
    public String valorFrete(String uf) {
        return EstadosEnum.find(uf);
    }
}

