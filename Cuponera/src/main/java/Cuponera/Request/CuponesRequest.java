package Cuponera.Request;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class CuponesRequest {

    @NotBlank(message = "Valor Vacio")
    @Size(min=1, max=25, message=" Max 25 caracteres")
    @Digits(integer = 3,message = "Valor de 3 digitos", fraction = 0)
    int valor;

    @NotBlank(message = "Valor Vacio")
    @Size(min=1, max=25, message=" Max 25 caracteres")
    int compra_minima;

    @NotBlank(message = "Valor Vacio")
    @Size(min=1, max=25, message=" Max 25 caracteres")
    String num_referencia;

    @NotBlank(message = "Valor Vacio")
    @Size(min=1, max=25, message=" Max 25 caracteres")
    String num_celular;

    @NotBlank(message = "Valor Vacio")
    @Size(min=1, max=25, message=" Max 25 caracteres")
    String descripcion;

    @NotBlank(message = "Valor Vacio")
    @Size(min=1, max=25, message=" Max 25 caracteres")
    LocalDateTime fecha_inicio_vigencia;

    @NotBlank(message = "Valor Vacio")
    @Size(min=1, max=25, message=" Max 25 caracteres")
    LocalDateTime fecha_fin_vigencia;

    @NotBlank(message = "Valor Vacio")
    @Size(min=1, max=25, message=" Max 25 caracteres")
    int cantidad_cupones;

    public CuponesRequest(){

    }

    public CuponesRequest(int valor, int compra_minima, String num_referencia, String num_celular, String descripcion, LocalDateTime fecha_inicio_vigencia, LocalDateTime fecha_fin_vigencia, int cantidad_cupones) {
        this.valor = valor;
        this.compra_minima = compra_minima;
        this.num_referencia = num_referencia;
        this.num_celular = num_celular;
        this.descripcion = descripcion;
        this.fecha_inicio_vigencia = fecha_inicio_vigencia;
        this.fecha_fin_vigencia = fecha_fin_vigencia;
        this.cantidad_cupones = cantidad_cupones;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public long getCompra_minima() {
        return compra_minima;
    }

    public void setCompra_minima(int compra_minima) {
        this.compra_minima = compra_minima;
    }

    public String getNum_referencia() {
        return num_referencia;
    }

    public void setNum_referencia(String num_referencia) {
        this.num_referencia = num_referencia;
    }

    public String getNum_celular() {
        return num_celular;
    }

    public void setNum_celular(String num_celular) {
        this.num_celular = num_celular;
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

    public int getCantidad_cupones() {
        return cantidad_cupones;
    }

    public void setCantidad_cupones(int cantidad_cupones) {
        this.cantidad_cupones = cantidad_cupones;
    }

    @Override
    public String toString() {
        return "CuponesRequest{" +
                "valor=" + valor +
                ", compra_minima=" + compra_minima +
                ", num_referencia='" + num_referencia + '\'' +
                ", num_celular='" + num_celular + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha_inicio_vigencia=" + fecha_inicio_vigencia +
                ", fecha_fin_vigencia=" + fecha_fin_vigencia +
                ", cantidad_cupones=" + cantidad_cupones +
                '}';
    }
}
