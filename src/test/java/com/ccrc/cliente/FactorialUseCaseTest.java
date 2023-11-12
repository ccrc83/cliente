package com.ccrc.cliente;

import com.ccrc.cliente.application.FactorialUseCase;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
public class FactorialUseCaseTest {

    @Mock
    private FactorialUseCase factorialService;

    @Test
    void testFactorial_casoDeExito() {
        Mockito.when(factorialService.factorial(5)).thenReturn(120L);

        long factorial = factorialService.factorial(5);

        assertEquals(120L, factorial);
    }
}
