package com.samucatezu.consultafreteapi.validation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class CepInexistenteException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public CepInexistenteException(String exception) {
        super(exception);
    }

}
