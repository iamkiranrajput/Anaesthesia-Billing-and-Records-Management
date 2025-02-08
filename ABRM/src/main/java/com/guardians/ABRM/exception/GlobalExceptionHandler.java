package com.guardians.ABRM.exception;

import com.guardians.ABRM.dto.APIResponse;
import com.guardians.ABRM.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

@ExceptionHandler(MethodArgumentNotValidException.class)
    private ResponseEntity<APIResponse<List<ErrorDTO>>> handleValidationException(MethodArgumentNotValidException e){

            List<ErrorDTO> errors = new ArrayList<>();
            e.getBindingResult().getFieldErrors().forEach(fieldError -> {
                        ErrorDTO dto = new ErrorDTO(fieldError.getField(),fieldError.getDefaultMessage());
                        errors.add(dto);
            });

            APIResponse<List<ErrorDTO>> response = new APIResponse<>();
            response.setStatus(String.valueOf(HttpStatus.BAD_REQUEST));
            response.setData(errors);
            response.setMessage("FAILED");

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<APIResponse<String>> handleInvalidEnum(HttpMessageNotReadableException ex) {

        APIResponse<String> response = new APIResponse<>();
        response.setStatus(String.valueOf(HttpStatus.BAD_REQUEST));
        response.setMessage("Invalid value for PatientType. Accepted values are: PAYING, SCHEME.");
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }
}
