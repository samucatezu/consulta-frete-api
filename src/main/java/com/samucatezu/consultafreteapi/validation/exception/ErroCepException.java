package com.samucatezu.consultafreteapi.validation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ErroCepException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ErroCepException(String exception) {
        super(exception);
    }

}
