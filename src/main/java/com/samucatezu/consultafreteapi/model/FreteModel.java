package com.samucatezu.consultafreteapi.model;

import com.samucatezu.consultafreteapi.response.FreteResponse;
import com.samucatezu.consultafreteapi.utils.EstadosEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class FreteModel {

    private String cep;
    private String rua;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private BigDecimal frete;

    public FreteModel() {
    }

    public FreteModel(FreteResponse freteResponse) {
        this.cep = freteResponse.getCep();
        this.rua = freteResponse.getLogradouro();
        this.complemento = freteResponse.getComplemento();
        this.bairro = freteResponse.getBairro();
        this.cidade = freteResponse.getLocalidade();
        this.estado = freteResponse.getUf();
        this.frete = new BigDecimal(EstadosEnum.find(freteResponse.getUf()));
    }

    @Override
    public String toString() {
        return "{\n" +
                "   \"cep\": \"" + cep + "\",\n" +
                "   \"rua\": \"" + rua + "\"\n" +
                "   \"complemento\": \"" + complemento + "\",\n" +
                "   \"bairro\": \"" + bairro + "\",\n" +
                "   \"cidade\": \"" + cidade + "\",\n" +
                "   \"estado\": \"" + estado + "\",\n" +
                "   \"frete\": " + frete.toString() + "\n" +
                "}";
    }
}
