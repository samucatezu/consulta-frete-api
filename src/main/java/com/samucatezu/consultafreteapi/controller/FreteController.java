package com.samucatezu.consultafreteapi.controller;

import com.samucatezu.consultafreteapi.request.FreteRequest;
import com.samucatezu.consultafreteapi.service.FreteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/endereco")
@RestController
public class FreteController {

    private final FreteService freteService;

    @PostMapping("/consulta")
    public ResponseEntity consultaCep(@RequestBody FreteRequest freteRequest) {
        return ResponseEntity.ok(freteService.executa(freteRequest));
    }
}
