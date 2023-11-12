package com.ccrc.cliente;

import com.ccrc.cliente.application.FactorialUseCase;
import com.ccrc.cliente.application.HolaUseCase;
import com.ccrc.cliente.domain.Saludo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HolaUseCaseTest {
    @Test
    void testHolaUseCase_casoDeExito() {
        HolaUseCase holaUseCase = new HolaUseCase();
        Saludo saludar = holaUseCase.saludar();
        assertEquals("Hola, equipo de desarrollo!", saludar.getMensaje());
    }
}
