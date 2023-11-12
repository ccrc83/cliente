package com.ccrc.cliente.application;

import com.ccrc.cliente.domain.Saludo;
import org.springframework.stereotype.Service;

@Service
public class HolaUseCase {
    private static final String MENSAJE= "Hola, equipo de desarrollo!";
    public Saludo saludar() {
        Saludo saludo=new Saludo(MENSAJE);
        return saludo;
    }
}
