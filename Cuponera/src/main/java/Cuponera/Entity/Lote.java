package Cuponera.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Lote")
public class Lote implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLote")
    int idLote;

    @Column(name = "descripcion", columnDefinition = "VARCHAR(200)", length = 200)
    String descripcion;

    @Column(name = "estatus", columnDefinition = "TINYINT(1)")
    boolean estatus;

    // Getters and setters, constructor, toString, etc.


    public Lote(){

    }

    public Lote(int idLote, String descripcion, boolean estatus) {
        this.idLote = idLote;
        this.descripcion = descripcion;
        this.estatus = estatus;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "idLote=" + idLote +
                ", descripcion='" + descripcion + '\'' +
                ", estatus=" + estatus +
                '}';
    }
}
