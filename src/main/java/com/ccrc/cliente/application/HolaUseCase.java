package com.ccrc.cliente.application;

import org.springframework.stereotype.Service;

@Service
public class HolaUseCase {

    public String saludar() {
        return "Hola, equipo de desarrollo!";
    }
}
