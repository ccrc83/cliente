package com.ccrc.cliente.adapter;

import com.ccrc.cliente.application.FactorialUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class FactorialController {
    @Autowired
    private FactorialUseCase factorialUseCase;

    @GetMapping("/factorial/{numero}")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Long> consultarCliente(@PathVariable int numero) {

        return ResponseEntity.ok(factorialUseCase.factorial(numero));
    }
}
