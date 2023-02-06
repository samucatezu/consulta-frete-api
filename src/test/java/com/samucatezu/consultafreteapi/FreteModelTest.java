package com.samucatezu.consultafreteapi;

import com.samucatezu.consultafreteapi.model.FreteModel;
import com.samucatezu.consultafreteapi.request.FreteRequest;
import com.samucatezu.consultafreteapi.service.FreteService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;


import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;


@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class FreteModelTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();
    @Autowired
    private FreteService service;

    @Test
    public void consultaComCepValido(){
        FreteRequest freteRequest = new FreteRequest();
        freteRequest.setCep("06454000");

        String resposta = service.executa(freteRequest);

        FreteModel freteModel = new FreteModel();
        freteModel.setCep("06454-000");
        freteModel.setRua("Alameda Rio Negro");
        freteModel.setComplemento("");
        freteModel.setBairro("Alphaville Centro Industrial e Empresarial/Alphaville.");
        freteModel.setCidade("Barueri");
        freteModel.setEstado("SP");
        freteModel.setFrete(new BigDecimal("7.85"));

        assertEquals(resposta, freteModel.toString());
    }

    @Test
    public void consultaComCepValido2(){
        FreteRequest freteRequest = new FreteRequest();
        freteRequest.setCep("04711-035");

        String resposta = service.executa(freteRequest);

        FreteModel freteModel = new FreteModel();
        freteModel.setCep("04711-035");
        freteModel.setRua("Rua Arquiteto Olavo Redig de Campos");
        freteModel.setComplemento("");
        freteModel.setBairro("Vila São Francisco (Zona Sul)");
        freteModel.setCidade("São Paulo");
        freteModel.setEstado("SP");
        freteModel.setFrete(new BigDecimal("7.85"));

        assertEquals(resposta, freteModel.toString());
    }
    private void assertThrows(Executable executable) {
    }
    @Test
    public void consultaComCepInexistente() {

        assertThrows(new Executable() {

            @Override
            public void execute() throws Throwable {
                FreteRequest freteRequest = new FreteRequest();
                freteRequest.setCep("11402-892");
            }
        });
    }



    @Test
    public void consultaComCepInvalido() {
        assertThrows(new Executable() {

            @Override
            public void execute() throws Throwable {
                FreteRequest freteRequest = new FreteRequest();
                freteRequest.setCep("90480ABC");
            }
        });
    }
}
