package com.challenge.challengeJavaEj2.exception;

public class MarcaNoEncontradaException extends RuntimeException{
    public MarcaNoEncontradaException(String marca){
        super(String.format("Marca %s no encontrada" , marca ));
    }
}
