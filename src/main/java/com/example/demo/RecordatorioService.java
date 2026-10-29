
package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class RecordatorioService {

    private final RecordatorioRepository repository;

    public RecordatorioService(RecordatorioRepository repository) {
        this.repository = repository;
    }

    public List<Recordatorio> findAll() {
        return repository.findAll();
    }

    public Recordatorio findById(String id) {
        return repository.findById(id);
    }

    public List<Recordatorio> buscarPorMedicamento(String medicamento) {
        return repository.findByMedicamentoContaining(medicamento);
    }

    public List<Recordatorio> buscarPorCantidad(int cantidad) {
        return repository.findByCantidad(cantidad);
    }

    public Recordatorio save(Recordatorio recordatorio) {
        return repository.save(recordatorio);
    }

    public Recordatorio update(String id, Recordatorio nuevo) {
        Recordatorio existente = repository.findById(id);

        if (existente == null) {
            return null;
        }

        nuevo.setId(id);
        return repository.update(nuevo);
    }

    // Modificar solo los campos enviados
    public Recordatorio patch(String id, Map<String, Object> cambios) {
        Recordatorio recordatorio = repository.findById(id);

        if (recordatorio == null) {
            return null;
        }

        if (cambios.containsKey("medicamento")) {
            recordatorio.setMedicamento(
                    (String) cambios.get("medicamento")
            );
        }

        if (cambios.containsKey("fecha")) {
            recordatorio.setFecha((String) cambios.get("fecha"));
        }

        if (cambios.containsKey("hora")) {
            recordatorio.setHora((String) cambios.get("hora"));
        }

        if (cambios.containsKey("cantidad")) {
            Object cantidad = cambios.get("cantidad");

            if (cantidad instanceof Number) {
                recordatorio.setCantidad(((Number) cantidad).intValue());
            }
        }

        if (cambios.containsKey("usuarioId")) {
            recordatorio.setUsuarioId((String) cambios.get("usuarioId"));
        }

        if (cambios.containsKey("tomado")) {
            Object tomado = cambios.get("tomado");

            if (tomado instanceof Boolean) {
                recordatorio.setTomado((Boolean) tomado);
            }
        }

        return repository.update(recordatorio);
    }

    public boolean deleteById(String id) {
        return repository.deleteById(id);
    }
}
