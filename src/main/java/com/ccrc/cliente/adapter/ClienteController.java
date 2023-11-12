package com.ccrc.cliente.adapter;



import com.ccrc.cliente.application.ClienteUseCase;
import com.ccrc.cliente.application.exception.ErrorException;
import com.ccrc.cliente.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteUseCase clienteUseCase;

    @GetMapping
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Cliente> consultarCliente(@RequestParam String tipoDocumento, @RequestParam String numeroDocumento) {

            Cliente cliente = clienteUseCase.consultarCliente(tipoDocumento, numeroDocumento);
            return ResponseEntity.ok(cliente);

    }
/*
   @PostMapping
   @ResponseStatus(HttpStatus.BAD_REQUEST)
   public ResponseEntity<Map<String, Object>> crearPrestamo(@RequestBody PrestamoDto prestamoDto) {
      return ResponseEntity.ok(createLoanUseCase.execute(prestamoDto));
   }

    @GetMapping("/{idPrestamo}")
    public ResponseEntity<Prestamo> buscarPrestamo(@PathVariable int idPrestamo) {
        Prestamo prestamo = findLoanByIdUseCase.execute(idPrestamo);
        return new ResponseEntity<>(prestamo, HttpStatus.OK);
    }
*/

}

