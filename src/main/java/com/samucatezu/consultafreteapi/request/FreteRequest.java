package com.samucatezu.consultafreteapi.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@AllArgsConstructor
public class FreteRequest {

    @NotBlank(message = "{required.validation}")
    @Size(min = 8, max = 9, message = "Por favor, insira um cep valido!")
    private String cep;

}