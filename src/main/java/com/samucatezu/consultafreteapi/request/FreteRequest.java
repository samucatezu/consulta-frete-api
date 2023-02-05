package com.samucatezu.consultafreteapi.request;


import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class FreteRequest {

    @NotNull
    @NotEmpty
    @Size(min = 8, max = 9)
    private String cep;


}