package Cuponera.Repository;

import Cuponera.Entity.Lote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoteRepository extends JpaRepository<Lote, Long> {

    @Query("SELECT c FROM Lote c")
    List<Lote> GetAllLotes();
}
