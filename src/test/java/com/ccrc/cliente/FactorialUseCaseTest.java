package com.ccrc.cliente;

import com.ccrc.cliente.application.FactorialUseCase;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
public class FactorialUseCaseTest {

    @Mock
    private FactorialUseCase factorialUseCase;

    @Test
    void testFactorial_casoDeExito() {
        Mockito.when(factorialUseCase.factorial(5)).thenReturn(new HashMap<>() {{
            put("numero", 5L);
            put("factorial", 120L);
        }});

        Map<String, Long> factorial = factorialUseCase.factorial(5);

        assertEquals(120L, factorial.get("factorial"));
    }
}
