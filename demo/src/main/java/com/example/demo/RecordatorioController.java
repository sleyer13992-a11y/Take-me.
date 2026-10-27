
package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/recordatorios")
public class RecordatorioController {

    private final RecordatorioService service;

    public RecordatorioController(RecordatorioService service) {
        this.service = service;
    }

    // GET: consultar todos
    @GetMapping
    public ResponseEntity<List<Recordatorio>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    // GET: buscar por medicamento
    // Ejemplo: /api/recordatorios/buscar?medicamento=Medicamento
    @GetMapping("/buscar")
    public ResponseEntity<List<Recordatorio>> buscarPorMedicamento(
            @RequestParam("medicamento") String medicamento) {

        return ResponseEntity.ok(
                service.buscarPorMedicamento(medicamento)
        );
    }

    // GET: buscar por cantidad
    // Ejemplo: /api/recordatorios/buscar/cantidad?cantidad=1
    @GetMapping("/buscar/cantidad")
    public ResponseEntity<List<Recordatorio>> buscarPorCantidad(
            @RequestParam("cantidad") int cantidad) {

        return ResponseEntity.ok(
                service.buscarPorCantidad(cantidad)
        );
    }

    // GET: consultar cabecera User-Agent
    @GetMapping("/cabecera")
    public ResponseEntity<String> consultarCabecera(
            @RequestHeader(
                    value = "User-Agent",
                    defaultValue = "No especificado"
            ) String userAgent) {

        return ResponseEntity.ok("User-Agent recibido: " + userAgent);
    }

    // GET: buscar por ID
    // Ejemplo: /api/recordatorios/ID_DEL_RECORDATORIO
    @GetMapping("/{id}")
    public ResponseEntity<Recordatorio> findById(
            @PathVariable("id") String id) {

        Recordatorio recordatorio = service.findById(id);

        if (recordatorio == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(recordatorio);
    }

    // POST: crear un recordatorio
    @PostMapping
    public ResponseEntity<Recordatorio> create(
            @RequestBody Recordatorio recordatorio) {

        Recordatorio creado = service.save(recordatorio);

        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    // PUT: actualizar todos los campos
    @PutMapping("/{id}")
    public ResponseEntity<Recordatorio> update(
            @PathVariable("id") String id,
            @RequestBody Recordatorio recordatorio) {

        Recordatorio actualizado = service.update(id, recordatorio);

        if (actualizado == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(actualizado);
    }

    // PATCH: actualizar solo algunos campos
    @PatchMapping("/{id}")
    public ResponseEntity<Recordatorio> patch(
            @PathVariable("id") String id,
            @RequestBody Map<String, Object> cambios) {

        Recordatorio actualizado = service.patch(id, cambios);

        if (actualizado == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(actualizado);
    }

    // DELETE: eliminar un recordatorio
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable("id") String id) {

        boolean eliminado = service.deleteById(id);

        if (!eliminado) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();
    }
}
