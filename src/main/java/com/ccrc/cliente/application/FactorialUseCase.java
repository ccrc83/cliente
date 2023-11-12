package com.ccrc.cliente.application;

import com.ccrc.cliente.application.exception.ErrorException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FactorialUseCase {
    public Map<String, Long>  factorial(int numero) {

        if (numero < 0) {
            throw new ErrorException("El número debe ser mayor o igual a 0");
        }

        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        Map<String, Long> response = new HashMap<>();
        response.put("numero", (long) numero);
        response.put("factorial", factorial);
        return response;
    }
}
