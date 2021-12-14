package org.hbt.test.personas.model.entity.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TechnicalException extends Exception{

    private static String message = "Se ha presentado un error técnico: ";

    private String error;

    public TechnicalException(String error){
        super(message + error);
    }
}
