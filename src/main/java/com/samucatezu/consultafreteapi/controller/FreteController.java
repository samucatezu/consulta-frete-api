package com.samucatezu.consultafreteapi.controller;

import com.samucatezu.consultafreteapi.request.FreteRequest;
import com.samucatezu.consultafreteapi.response.FreteResponse;
import com.samucatezu.consultafreteapi.service.FreteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("v1/consulta-endereco")
public class FreteController {

    @Autowired
    private FreteService freteService;

    @PostMapping
    public ResponseEntity<FreteResponse> ConsultaValorCep(@RequestBody @Valid FreteRequest freteRequest) throws Exception {
        FreteResponse frete = freteService.freteResponse(freteRequest);

        return ResponseEntity.ok().body(freteService.freteResponse(freteRequest));
    }

}
