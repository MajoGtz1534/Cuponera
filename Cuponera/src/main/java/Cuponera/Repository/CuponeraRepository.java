package Cuponera.Repository;

import Cuponera.Entity.Cupones;
import Cuponera.Entity.Prueba;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Repository
public interface CuponeraRepository extends JpaRepository<Cupones, Integer> {

//    @Query("SELECT c.idCupon, c.codigo FROM Cupones c WHERE c.idCupon=2")
//    List<Prueba>  GetAllCupones();

//    @Modifying
//    @Transactional
//    @Query("UPDATE Cupones c SET c.fechaInicioVigencia = :fechaInicioVigencia, c.fechaFinVigencia = :fechaFinVigencia, c.valor = :valor, c.compraMinima = :compraMinima, c.usuarioUpdate= :usuarioUpdate, c.fechaUpdate = :fechaUpdate WHERE c.idLote = :idLote")
//    Long editarCuponesLote(@Param("idLote")int idLote, @Param("fechaInicioVigencia")Date fechaInicioVigencia, @Param("fechaFinVigencia")Date fechaFinVigencia,
//                          @Param("valor")int valor,@Param("compraMinima")int compraMinima,@Param("usuarioUpdate")String usuarioUpdate,@Param("fechaUpdate")Date fechaUpdate);
//
//

    @Query("SELECT c FROM Cupones c WHERE c.id_lote =:id_lote")
    List<Cupones> cuponesPorLote(@Param("id_lote")int id_lote);

    @Modifying
    @Transactional
    @Query("DELETE FROM Cupones d WHERE d.id_lote =:id_lote")
    void borrarPorLote(@Param("id_lote")int id_lote);

}
