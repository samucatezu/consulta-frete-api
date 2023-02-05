package com.samucatezu.consultafreteapi.validation.exception;

import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

@Getter
public class ExceptionReponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date timestamp;
    private String message;
    private String details;

    public ExceptionReponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
