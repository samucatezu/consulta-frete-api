package com.samucatezu.consultafreteapi.validation.handler;

import com.samucatezu.consultafreteapi.validation.exception.CepIncorretoException;
import com.samucatezu.consultafreteapi.validation.exception.ExceptionReponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionReponse> handleAllExceptions(Exception ex, WebRequest request) {
        ExceptionReponse exceptionReponse = new ExceptionReponse(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(exceptionReponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(CepIncorretoException.class)
    public final ResponseEntity<ExceptionReponse> handleBadRequestException(Exception ex, WebRequest request) {
        ExceptionReponse exceptionReponse = new ExceptionReponse(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(exceptionReponse, HttpStatus.BAD_REQUEST);
    }
}