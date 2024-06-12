package Cuponera.Request;

import java.util.Date;

public class CuponesRequest {

    int idLote;

    int idCupon;

    int valor;

    int compraMinima;

    String codigo;

    String numReferencia;

    String numCelular;

    String descripcion;

    String usuarioInsert;

    String usuarioUpdate;


    Date fechaUso;

    Date fechaInicioVigencia;

    Date fechaFinVigencia;

    Date fechaUpdate;

    Date fechaInsert;

    Boolean status;

    public CuponesRequest(){

    }

    public CuponesRequest(Date fechaInicioVigencia, Date fechaFinVigencia, int valor, int compraMinima, String usuarioUpdate, Date fechaUpdate){
    }

    public CuponesRequest(int idLote, int idCupon, int valor, int compraMinima, String codigo, String numReferencia, String numCelular, String descripcion, String usuarioInsert, String usuarioUpdate, Date fechaUso, Date fechaInicioVigencia, Date fechaFinVigencia, Date fechaUpdate, Date fechaInsert, Boolean status) {
        this.idLote = idLote;
        this.idCupon = idCupon;
        this.valor = valor;
        this.compraMinima = compraMinima;
        this.codigo = codigo;
        this.numReferencia = numReferencia;
        this.numCelular = numCelular;
        this.descripcion = descripcion;
        this.usuarioInsert = usuarioInsert;
        this.usuarioUpdate = usuarioUpdate;
        this.fechaUso = fechaUso;
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.fechaFinVigencia = fechaFinVigencia;
        this.fechaUpdate = fechaUpdate;
        this.fechaInsert = fechaInsert;
        this.status = status;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public int getIdCupon() {
        return idCupon;
    }

    public void setIdCupon(int idCupon) {
        this.idCupon = idCupon;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public Date getFechaUso() {
        return fechaUso;
    }

    public void setFechaUso(Date fechaUso) {
        this.fechaUso = fechaUso;
    }

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public Date getFechaUpdate() {
        return fechaUpdate;
    }

    public void setFechaUpdate(Date fechaUpdate) {
        this.fechaUpdate = fechaUpdate;
    }

    public Date getFechaInsert() {
        return fechaInsert;
    }

    public void setFechaInsert(Date fechaInsert) {
        this.fechaInsert = fechaInsert;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CuponesRequest{" +
                "idLote=" + idLote +
                ", idCupon=" + idCupon +
                ", valor=" + valor +
                ", compraMinima=" + compraMinima +
                ", codigo='" + codigo + '\'' +
                ", numReferencia='" + numReferencia + '\'' +
                ", numCelular='" + numCelular + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", usuarioInsert='" + usuarioInsert + '\'' +
                ", usuarioUpdate='" + usuarioUpdate + '\'' +
                ", fechaUso=" + fechaUso +
                ", fechaInicioVigencia=" + fechaInicioVigencia +
                ", fechaFinVigencia=" + fechaFinVigencia +
                ", fechaUpdate=" + fechaUpdate +
                ", fechaInsert=" + fechaInsert +
                ", status=" + status +
                '}';
    }
}
