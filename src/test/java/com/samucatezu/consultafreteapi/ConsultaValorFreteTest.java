package com.samucatezu.consultafreteapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.samucatezu.consultafreteapi.controller.FreteController;
import com.samucatezu.consultafreteapi.model.Frete;

import com.samucatezu.consultafreteapi.request.FreteRequest;
import com.samucatezu.consultafreteapi.response.FreteResponse;
import com.samucatezu.consultafreteapi.service.FreteService;
import com.samucatezu.consultafreteapi.validation.handler.CustomizedResponseEntityExceptionHandler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@ExtendWith(SpringExtension.class)
@WebMvcTest(value = FreteController.class)
public class ConsultaValorFreteTest {
    @Autowired
    private MockMvc mvc;

    @InjectMocks
    private FreteController freteController;

    @MockBean
    private FreteService freteService;

    String cep = "11453240";

//    FreteRequest mockRequest = new FreteRequest("11453240");

    @Test
    public void should_return_valorFrete() throws Exception {
        FreteRequest mockRequest = new FreteRequest("11453240");


        // Send course as body to /students/Student1/courses
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/v1/consulta-endereco")
                .accept(MediaType.APPLICATION_JSON).content(cep)
                .contentType(MediaType.APPLICATION_JSON);

        MvcResult result = mvc.perform(requestBuilder).andReturn();

        MockHttpServletResponse response = result.getResponse();

        assertEquals(HttpStatus.OK.value(), response.getStatus());



    }
}
