package com.Entity;

import jakarta.persistence.*;

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
    private datetime fechaUso;

    @Column(name = "fechaInicioVigencia", columnDefinition = "datetime")
    private datetime fechaInicioVigencia;

    @Column(name = "fechaFinVigencia", columnDefinition = "datetime")
    private datetime fechaFinVigencia;

    @Column(name = "valor", columnDefinition = "bigint(20)")
    private bigint valor;

    @Column(name = "compraMinima", columnDefinition = "bigint(20)")
    private bigint compraMinima;

    @Column(name = "descripcion", columnDefinition = "varchar(200)")
    private String descripcion;

    @Column(name = "idLote", columnDefinition = "int(12)")
    private int idLote;

    @Column(name = "usuarioInsert", columnDefinition = "varchar(12)")
    private String usuarioInsert;

    @Column(name = "usuarioUpdate", columnDefinition = "varchar(12)")
    private String usuarioUpdate;





}
