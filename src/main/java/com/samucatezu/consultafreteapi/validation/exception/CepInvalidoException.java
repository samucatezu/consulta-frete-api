package com.samucatezu.consultafreteapi.validation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class CepInvalidoException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public CepInvalidoException(String exception) {
        super(exception);
    }

}
