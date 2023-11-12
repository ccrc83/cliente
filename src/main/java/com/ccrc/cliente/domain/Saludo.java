package com.ccrc.cliente.domain;

public class Saludo {
    private final String mensaje;

    public Saludo(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
