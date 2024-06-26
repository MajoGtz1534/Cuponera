package Cuponera.Request;

import java.time.LocalDateTime;

public class CuponRequestEditar {


    private int compra_minima;

    private String codigo;

    private String descripcion;

    private LocalDateTime fecha_inicio_vigencia;

    private LocalDateTime fecha_fin_vigencia;

    private String usuario_update;

    private LocalDateTime fecha_update;

    public CuponRequestEditar(){

    }

    public CuponRequestEditar(int compra_minima, String codigo, String descripcion, LocalDateTime fecha_inicio_vigencia, LocalDateTime fecha_fin_vigencia, String usuario_update, LocalDateTime fecha_update) {
        this.compra_minima = compra_minima;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha_inicio_vigencia = fecha_inicio_vigencia;
        this.fecha_fin_vigencia = fecha_fin_vigencia;
        this.usuario_update = usuario_update;
        this.fecha_update = fecha_update;
    }

    public int getCompra_minima() {
        return compra_minima;
    }

    public void setCompra_minima(int compra_minima) {
        this.compra_minima = compra_minima;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFecha_inicio_vigencia() {
        return fecha_inicio_vigencia;
    }

    public void setFecha_inicio_vigencia(LocalDateTime fecha_inicio_vigencia) {
        this.fecha_inicio_vigencia = fecha_inicio_vigencia;
    }

    public LocalDateTime getFecha_fin_vigencia() {
        return fecha_fin_vigencia;
    }

    public void setFecha_fin_vigencia(LocalDateTime fecha_fin_vigencia) {
        this.fecha_fin_vigencia = fecha_fin_vigencia;
    }

    public String getUsuario_update() {
        return usuario_update;
    }

    public void setUsuario_update(String usuario_update) {
        this.usuario_update = usuario_update;
    }

    public LocalDateTime getFecha_update() {
        return fecha_update;
    }

    public void setFecha_update(LocalDateTime fecha_update) {
        this.fecha_update = fecha_update;
    }

    @Override
    public String toString() {
        return "CuponRequestEditar{" +
                "compra_minima=" + compra_minima +
                ", codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha_inicio_vigencia=" + fecha_inicio_vigencia +
                ", fecha_fin_vigencia=" + fecha_fin_vigencia +
                ", usuario_update='" + usuario_update + '\'' +
                ", fecha_update=" + fecha_update +
                '}';
    }
}
