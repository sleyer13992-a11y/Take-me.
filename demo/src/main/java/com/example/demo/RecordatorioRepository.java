
package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class RecordatorioRepository {

    private final Map<String, Recordatorio> recordatorios = new HashMap<>();

    public RecordatorioRepository() {
        initSampleData();
    }

    // Cargar 10 recordatorios de ejemplo
    public void initSampleData() {
        agregarEjemplo("Medicamento A", "2026-10-27", "08:00", 1, "usuario1");
        agregarEjemplo("Medicamento B", "2026-10-27", "12:00", 1, "usuario1");
        agregarEjemplo("Medicamento C", "2026-10-27", "20:00", 2, "usuario2");
        agregarEjemplo("Medicamento D", "2026-10-28", "07:00", 1, "usuario2");
        agregarEjemplo("Medicamento E", "2026-10-28", "09:00", 1, "usuario3");
        agregarEjemplo("Medicamento F", "2026-10-28", "14:00", 2, "usuario3");
        agregarEjemplo("Medicamento G", "2026-10-29", "08:30", 1, "usuario1");
        agregarEjemplo("Medicamento H", "2026-10-29", "16:00", 1, "usuario2");
        agregarEjemplo("Medicamento I", "2026-10-30", "10:00", 1, "usuario3");
        agregarEjemplo("Medicamento J", "2026-10-30", "21:00", 2, "usuario1");
    }

    private void agregarEjemplo(String medicamento, String fecha,
                                String hora, int cantidad, String usuarioId) {
        Recordatorio recordatorio = new Recordatorio(
                medicamento, fecha, hora, cantidad, usuarioId
        );

        recordatorio.setId(UUID.randomUUID().toString());
        recordatorios.put(recordatorio.getId(), recordatorio);
    }

    // Consultar todos
    public List<Recordatorio> findAll() {
        return new ArrayList<>(recordatorios.values());
    }

    // Buscar por ID
    public Recordatorio findById(String id) {
        return recordatorios.get(id);
    }

    // Crear o guardar
    public Recordatorio save(Recordatorio recordatorio) {
        if (recordatorio.getId() == null || recordatorio.getId().isBlank()) {
            recordatorio.setId(UUID.randomUUID().toString());
        }

        recordatorios.put(recordatorio.getId(), recordatorio);
        return recordatorio;
    }

    // Actualizar
    public Recordatorio update(Recordatorio recordatorio) {
        if (!recordatorios.containsKey(recordatorio.getId())) {
            return null;
        }

        recordatorios.put(recordatorio.getId(), recordatorio);
        return recordatorio;
    }

    // Eliminar
    public boolean deleteById(String id) {
        return recordatorios.remove(id) != null;
    }

    // Buscar por nombre del medicamento
    public List<Recordatorio> findByMedicamentoContaining(String medicamento) {
        return recordatorios.values()
                .stream()
                .filter(r -> r.getMedicamento() != null
                        && r.getMedicamento().toLowerCase()
                        .contains(medicamento.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Buscar por cantidad
    public List<Recordatorio> findByCantidad(int cantidad) {
        return recordatorios.values()
                .stream()
                .filter(r -> r.getCantidad() == cantidad)
                .collect(Collectors.toList());
    }
}
