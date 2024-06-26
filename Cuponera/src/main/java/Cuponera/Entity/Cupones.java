package Cuponera.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "Cupones")
public class Cupones implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupon")
    private int id_cupon;

    @Column(name = "codigo", nullable = false, length = 10)
    private String codigo;

    @Column(name = "num_referencia", length = 10)
    private String num_referencia;

    @Column(name = "num_celular", length = 15)
    private String num_celular;

    @Column(name = "fecha_uso")
    private LocalDateTime fecha_uso;

    @Column(name = "fecha_inicio_vigencia")
    private LocalDateTime fecha_inicio_vigencia;

    @Column(name = "fecha_fin_vigencia")
    private LocalDateTime fecha_fin_vigencia;

    @Column(name = "valor")
    private Long valor;

    @Column(name = "compra_minima")
    private Long compra_minima;

    @Column(name = "descripcion", length = 200)
    private String descripcion;


    @Column(name = "id_lote")
    private int id_lote;

    @Column(name = "usuario_insert", length = 10)
    private String usuario_insert;

    @Column(name = "usuario_update", length = 10)
    private String usuario_update;

    @Column(name = "fecha_insert")
    private LocalDateTime fecha_insert;

    @Column(name = "fecha_update")
    private LocalDateTime fecha_update;

    @Column(name = "estatus")
    private boolean estatus;

    public Cupones()
    {

    }

    public Cupones(int id_cupon, String codigo, String num_referencia, String num_celular, LocalDateTime fecha_uso,LocalDateTime fecha_inicio_vigencia, LocalDateTime fecha_fin_vigencia, Long valor, Long compra_minima, String descripcion, int id_lote, String usuario_insert, String usuario_update, LocalDateTime fecha_insert, LocalDateTime fecha_update, boolean estatus) {
        this.id_cupon = id_cupon;
        this.codigo = codigo;
        this.num_referencia = num_referencia;
        this.num_celular = num_celular;
        this.fecha_uso = fecha_uso;
        this.fecha_inicio_vigencia = fecha_inicio_vigencia;
        this.fecha_fin_vigencia = fecha_fin_vigencia;
        this.valor = valor;
        this.compra_minima = compra_minima;
        this.descripcion = descripcion;
        this.id_lote = id_lote;
        this.usuario_insert = usuario_insert;
        this.usuario_update = usuario_update;
        this.fecha_insert = fecha_insert;
        this.fecha_update = fecha_update;
        this.estatus = estatus;
    }

    public int getId_cupon() {
        return id_cupon;
    }

    public void setId_cupon(int id_cupon) {
        this.id_cupon = id_cupon;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public LocalDateTime getFecha_uso() {
        return fecha_uso;
    }

    public void setFecha_uso(LocalDateTime fecha_uso) {
        this.fecha_uso = fecha_uso;
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

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public Long getCompra_minima() {
        return compra_minima;
    }

    public void setCompra_minima(Long compra_minima) {
        this.compra_minima = compra_minima;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_lote() {
        return id_lote;
    }

    public void setId_lote(int id_lote) {
        this.id_lote = id_lote;
    }

    public String getUsuario_insert() {
        return usuario_insert;
    }

    public void setUsuario_insert(String usuario_insert) {
        this.usuario_insert = usuario_insert;
    }

    public String getUsuario_update() {
        return usuario_update;
    }

    public void setUsuario_update(String usuario_update) {
        this.usuario_update = usuario_update;
    }

    public LocalDateTime getFecha_insert() {
        return fecha_insert;
    }

    public void setFecha_insert(LocalDateTime fecha_insert) {
        this.fecha_insert = fecha_insert;
    }

    public LocalDateTime getFecha_update() {
        return fecha_update;
    }

    public void setFecha_update(LocalDateTime fecha_update) {
        this.fecha_update = fecha_update;
    }

    public boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }


    @Override
    public String toString() {
        return "Cupones{" +
                "id_cupon=" + id_cupon +
                ", codigo='" + codigo + '\'' +
                ", num_referencia='" + num_referencia + '\'' +
                ", num_celular='" + num_celular + '\'' +
                ", fecha_uso=" + fecha_uso +
                ", fecha_inicio_vigencia=" + fecha_inicio_vigencia +
                ", fecha_fin_vigencia=" + fecha_fin_vigencia +
                ", valor=" + valor +
                ", compra_minima=" + compra_minima +
                ", descripcion='" + descripcion + '\'' +
                ", id_lote=" + id_lote +
                ", usuario_insert='" + usuario_insert + '\'' +
                ", usuario_update='" + usuario_update + '\'' +
                ", fecha_insert=" + fecha_insert +
                ", fecha_update=" + fecha_update +
                ", estatus=" + estatus +
                '}';
    }
}
