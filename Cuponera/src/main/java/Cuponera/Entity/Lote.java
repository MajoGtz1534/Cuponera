package Cuponera.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Lote")
public class Lote implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lote")
    int id_lote;

    @Column(name = "descripcion", columnDefinition = "VARCHAR(200)", length = 200)
    String descripcion;

    @Column(name = "estatus", columnDefinition = "TINYINT(1)")
    boolean estatus;

    // Getters and setters, constructor, toString, etc.


    public Lote(){

    }

    public Lote(int id_lote, String descripcion, boolean estatus) {
        this.id_lote = id_lote;
        this.descripcion = descripcion;
        this.estatus = estatus;
    }

    public int getId_lote() {
        return id_lote;
    }

    public void setIdLote(int id_lote) {
        this.id_lote = id_lote;
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
                "id_lote=" + id_lote +
                ", descripcion='" + descripcion + '\'' +
                ", estatus=" + estatus +
                '}';
    }
}
