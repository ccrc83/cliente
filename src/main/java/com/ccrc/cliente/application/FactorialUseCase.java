package com.ccrc.cliente.application;

import com.ccrc.cliente.application.exception.ErrorException;
import org.springframework.stereotype.Service;

@Service
public class FactorialUseCase {
    public long factorial(int numero) {
        if (numero < 0) {
            throw new ErrorException("El número debe ser mayor o igual a 0");
        }

        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
