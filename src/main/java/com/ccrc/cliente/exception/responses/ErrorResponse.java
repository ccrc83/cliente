package com.ccrc.cliente.exception.responses;

import java.util.HashMap;
import java.util.Map;

public class ErrorResponse {
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ErrorResponse(String mensaje) {
        this.mensaje = mensaje;
    }
    public Map<String, Object> toJson() {
        Map<String, Object> json = new HashMap<>();
        json.put("mensaje", mensaje);
        return json;
    }

}
