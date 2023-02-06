package com.samucatezu.consultafreteapi.validation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
<<<<<<<< HEAD:src/main/java/com/samucatezu/consultafreteapi/validation/exception/CepInexistenteException.java
public class CepInexistenteException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public CepInexistenteException(String exception) {
========
public class CepNaoEncontradoException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public CepNaoEncontradoException(String exception) {
>>>>>>>> 653c986e2aa06ff026d668bdf3b9090596ae8651:src/main/java/com/samucatezu/consultafreteapi/validation/exception/CepNaoEncontradoException.java
        super(exception);
    }

}
