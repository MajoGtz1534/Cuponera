package Cuponera.Service;

import Cuponera.Entity.Cupones;
import Cuponera.Entity.Prueba;
import Cuponera.Request.CuponRequestEditar;
import Cuponera.Request.CuponesRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CuponeraService {
    List obtenerCupones();
    String editarCuponesPorLote(int id_lote, CuponRequestEditar request);
    List<Cupones> mostrarPorLote(int id_lote);
    String borrarPorLote(int id_lote);

    String crearCupon(CuponesRequest request);
    Cupones actualizar(int id_lote, CuponesRequest request);
    Cupones buscar(int id);
    String eliminar(int id);
    List mostrar();
}
