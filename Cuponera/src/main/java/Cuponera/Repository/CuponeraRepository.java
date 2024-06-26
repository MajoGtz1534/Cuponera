package Cuponera.Repository;

import Cuponera.Entity.Cupones;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CuponeraRepository extends JpaRepository<Cupones, Integer> {

//    @Query("SELECT c.idCupon, c.codigo FROM Cupones c WHERE c.idCupon=2")
//    List<Prueba>  GetAllCupones();

    @Modifying
    @Transactional
    @Query("UPDATE Cupones c SET c.fecha_inicio_vigencia = :fecha_inicio_vigencia, c.fecha_fin_vigencia = :fecha_fin_vigencia, c.compra_minima = :compra_minima, c.usuario_update= :usuario_update, c.fecha_update = :fecha_update WHERE c.id_lote = :id_lote")
    void editarCuponesLote(@Param("id_lote")int id_lote, @Param("fecha_inicio_vigencia") LocalDateTime fecha_inicio_vigencia, @Param("fecha_fin_vigencia") LocalDateTime fecha_fin_vigencia, @Param("compra_minima")int compra_minima, @Param("usuario_update")String usuario_update, @Param("fecha_update") LocalDateTime fecha_update);



    @Query("SELECT c FROM Cupones c WHERE c.id_lote =:id_lote")
    List<Cupones> cuponesPorLote(@Param("id_lote")int id_lote);

    @Modifying
    @Transactional
    @Query("DELETE FROM Cupones d WHERE d.id_lote = :id_lote AND d.estatus = false")
    void borrarPorLote(@Param("id_lote")int id_lote);


}
