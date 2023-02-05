package com.samucatezu.consultafreteapi.service;

import com.samucatezu.consultafreteapi.request.FreteRequest;
import com.samucatezu.consultafreteapi.response.FreteResponse;

public interface FreteService {
    FreteResponse freteResponse(FreteRequest freteRequest) throws Exception;
    String valorFrete(String cep);
}
