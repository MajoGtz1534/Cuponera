package com.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Cupones")
public class Cupones {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCupon", columnDefinition ="number")
    private int idCupon;

    @Column(name="codigo", columnDefinition = "varchar(10)")
    private String codigo;

    @Column(name="numReferencia", columnDefinition = "varchar(10)")
    private String numReferencia;

    @Column(name = "numCelular", columnDefinition = "varchar(15)")
    private String numCelular;

    @Column(name = "fechaUso", columnDefinition = "datetime")
    private LocalDate fechaUso;

    @Column(name = "fechaInicioVigencia", columnDefinition = "datetime")
    private LocalDate fechaInicioVigencia;

    @Column(name = "fechaFinVigencia", columnDefinition = "datetime")
    private LocalDate fechaFinVigencia;

    @Column(name = "valor", columnDefinition = "bigint(20)")
    private int valor;

    @Column(name = "compraMinima", columnDefinition = "bigint(20)")
    private int compraMinima;

    @Column(name = "descripcion", columnDefinition = "varchar(200)")
    private String descripcion;

    @Column(name = "idLote", columnDefinition = "int(12)")
    private int idLote;

    @Column(name = "usuarioInsert", columnDefinition = "varchar(12)")
    private String usuarioInsert;

    @Column(name = "usuarioUpdate", columnDefinition = "varchar(12)")
    private String usuarioUpdate;

    public Cupones(){

    }

    public Cupones(int idCupon, String codigo, String numReferencia, String numCelular, LocalDate fechaUso, LocalDate fechaInicioVigencia, LocalDate fechaFinVigencia, int valor, int compraMinima, String descripcion, int idLote, String usuarioInsert, String usuarioUpdate) {
        this.idCupon = idCupon;
        this.codigo = codigo;
        this.numReferencia = numReferencia;
        this.numCelular = numCelular;
        this.fechaUso = fechaUso;
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.fechaFinVigencia = fechaFinVigencia;
        this.valor = valor;
        this.compraMinima = compraMinima;
        this.descripcion = descripcion;
        this.idLote = idLote;
        this.usuarioInsert = usuarioInsert;
        this.usuarioUpdate = usuarioUpdate;
    }

    public int getIdCupon() {
        return idCupon;
    }

    public void setIdCupon(int idCupon) {
        this.idCupon = idCupon;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(String numReferencia) {
        this.numReferencia = numReferencia;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public LocalDate getFechaUso() {
        return fechaUso;
    }

    public void setFechaUso(LocalDate fechaUso) {
        this.fechaUso = fechaUso;
    }

    public LocalDate getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(LocalDate fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public LocalDate getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(LocalDate fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCompraMinima() {
        return compraMinima;
    }

    public void setCompraMinima(int compraMinima) {
        this.compraMinima = compraMinima;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public String getUsuarioInsert() {
        return usuarioInsert;
    }

    public void setUsuarioInsert(String usuarioInsert) {
        this.usuarioInsert = usuarioInsert;
    }

    public String getUsuarioUpdate() {
        return usuarioUpdate;
    }

    public void setUsuarioUpdate(String usuarioUpdate) {
        this.usuarioUpdate = usuarioUpdate;
    }

    @Override
    public String toString() {
        return "Cupones{" +
                "idCupon=" + idCupon +
                ", codigo='" + codigo + '\'' +
                ", numReferencia='" + numReferencia + '\'' +
                ", numCelular='" + numCelular + '\'' +
                ", fechaUso=" + fechaUso +
                ", fechaInicioVigencia=" + fechaInicioVigencia +
                ", fechaFinVigencia=" + fechaFinVigencia +
                ", valor=" + valor +
                ", compraMinima=" + compraMinima +
                ", descripcion='" + descripcion + '\'' +
                ", idLote=" + idLote +
                ", usuarioInsert='" + usuarioInsert + '\'' +
                ", usuarioUpdate='" + usuarioUpdate + '\'' +
                '}';
    }
}
