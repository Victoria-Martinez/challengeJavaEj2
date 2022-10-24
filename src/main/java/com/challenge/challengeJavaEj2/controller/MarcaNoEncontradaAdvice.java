package com.challenge.challengeJavaEj2.controller;

import com.challenge.challengeJavaEj2.exception.MarcaNoEncontradaException;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

public class MarcaNoEncontradaAdvice{

    @ExceptionHandler(MarcaNoEncontradaException.class)
    @RequestMapping(produces = "application/json")
    @ResponseBody
    ResponseEntity<Map<String,String>> marcaNoEncontradaHandler(@NotNull MarcaNoEncontradaException exception){
        HashMap messageBody = new HashMap();
        messageBody.put("Error: ",exception.getMessage());
        return new ResponseEntity<Map<String,String>>(messageBody, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    @RequestMapping(produces = "application/json")
    @ResponseBody
    ResponseEntity<Map<String,String>> generalHandler(@NotNull Exception exception){
        HashMap messageBody = new HashMap();
        messageBody.put("Error: ",exception.getMessage());
        return new ResponseEntity<Map<String,String>>(messageBody,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
