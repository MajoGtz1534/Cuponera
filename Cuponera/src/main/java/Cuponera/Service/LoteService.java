package Cuponera.Service;

import Cuponera.Entity.Lote;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LoteService {
    List<Lote> GetAll();
}
