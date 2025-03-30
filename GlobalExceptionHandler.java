// filepath: d:\Documents\semproj\semproject\src\main\java\com\example\semproject\Exceptions\GlobalExceptionHandler.java
package com.example.semproject.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleException(Exception e, Model model) {
        model.addAttribute("errorMessage", e.getMessage());
        e.printStackTrace(); // Log the stack trace for debugging
        return "error"; // Return a custom error page (error.html)
    }
}