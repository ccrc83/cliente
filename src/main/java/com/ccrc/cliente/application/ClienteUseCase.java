package com.ccrc.cliente.application;

import com.ccrc.cliente.application.exception.ErrorException;
import com.ccrc.cliente.domain.Cliente;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ClienteUseCase {

    private static final Map<String, Cliente> clientes = new HashMap<>();

    static {
        clientes.put("C23445322", Cliente.builder()
                .tipoDocumento("C")
                .numeroDocumento("23445322")
                .primerNombre("Juan")
                .segundoNombre("David")
                .primerApellido("Perez")
                .segundoApellido("Garcia")
                .telefono("3123456789")
                .direccion("Calle 123 No. 45-67")
                .ciudadResidencia("Pereira")
                .build());
    }

    public Cliente consultarCliente(String tipoDocumento, String numeroDocumento) {
        if (!validarTipoDocumento(tipoDocumento)) {
            throw new ErrorException("El tipo de documento debe ser C o P");
        }

        Cliente cliente = clientes.get(tipoDocumento + numeroDocumento);
        if (cliente == null) {
            throw new ErrorException("El cliente no existe");
        }

        return cliente;
    }

    private boolean validarTipoDocumento(String tipoDocumento) {
        return tipoDocumento.equals("C") || tipoDocumento.equals("P");
    }

}
