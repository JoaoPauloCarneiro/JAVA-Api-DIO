package me.dio.SantanderBootcamp2023.Controller.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalException {


    private final Logger logeer =  LoggerFactory.getLogger(GlobalException.class);

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleUNPROCESSABLE_ENTITY (IllegalArgumentException dois) {
        return new ResponseEntity<>(dois.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNOTFOUND (NoSuchElementException tres) {
        return new ResponseEntity<>("ID NÃO EXISTENTE !!!!", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleINTERNAL_SERVER_ERROR (Throwable quatro) {
        var message = "ERRO INESPERADO";
        logeer.error("quatro");
        return new ResponseEntity<>(message,  HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
