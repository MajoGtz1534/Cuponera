package com.Repository;

import com.Entity.Cupones;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface CuponeraRepository extends JpaRepository<Cupones, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Cupones c SET c.fechaInicioVigencia = :fechaInicioVigencia, c.fechaFinVigencia = :fechaFinVigencia, c.valor = :valor, c.compraMinima = :compraMinima, c.usuarioUpdate= :usuarioUpdate, c.fechaUpdate = :fechaUpdate WHERE c.idLote = :idLote")
    Long editarCuponesLote(@Param("idLote")int idLote, @Param("fechaInicioVigencia")Date fechaInicioVigencia, @Param("fechaFinVigencia")Date fechaFinVigencia,
                          @Param("valor")int valor,@Param("compraMinima")int compraMinima,@Param("usuarioUpdate")String usuarioUpdate,@Param("fechaUpdate")Date fechaUpdate);


    @Query("SELECT d FROM CuponesDb d WHERE d.idLote =:idLote")
    List<Cupones> cuponesPorLote(@Param("idLote")int idLote);

    @Modifying
    @Transactional
    @Query("DELETE FROM Cupones d WHERE d.idLote =:idLote")
    void borrarPorLote(@Param("idLote")int idLote);

}
