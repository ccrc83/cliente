package com.ccrc.cliente.adapter;

import com.ccrc.cliente.application.HolaUseCase;
import com.ccrc.cliente.domain.Saludo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HolaController {
    @Autowired
    private HolaUseCase holaUseCase;

    @GetMapping("/hola")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Saludo> saludar() {
       return ResponseEntity.ok(holaUseCase.saludar());

    }
}
