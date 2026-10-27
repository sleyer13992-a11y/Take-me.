
package com.example.demo;

public class Recordatorio {

    private String id;
    private String medicamento;
    private String fecha;
    private String hora;
    private int cantidad;
    private String usuarioId;
    private boolean tomado;

    public Recordatorio() {
    }

    public Recordatorio(String medicamento, String fecha, String hora,
                        int cantidad, String usuarioId) {
        this.medicamento = medicamento;
        this.fecha = fecha;
        this.hora = hora;
        this.cantidad = cantidad;
        this.usuarioId = usuarioId;
        this.tomado = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public boolean isTomado() {
        return tomado;
    }

    public void setTomado(boolean tomado) {
        this.tomado = tomado;
    }
}
