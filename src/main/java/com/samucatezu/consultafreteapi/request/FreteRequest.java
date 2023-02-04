package com.samucatezu.consultafreteapi.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class FreteRequest {

    @NotNull @NotEmpty @Size(min = 8, max = 9)
    private String cepDestino;
}
