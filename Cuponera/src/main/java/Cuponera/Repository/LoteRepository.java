package Cuponera.Repository;

import Cuponera.Entity.Lote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoteRepository extends JpaRepository<Lote, Long> {

    @Query("SELECT c FROM Lote c")
    List<Lote> GetAllLotes();

//    @Query("SELECT p.id_lote FROM Lote p WHERE p.id_lote=:id_lote")
//    boolean existeId_Lote(@Param("id_lote")int id_lote);

}
