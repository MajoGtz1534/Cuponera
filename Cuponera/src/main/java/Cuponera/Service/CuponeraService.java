package Cuponera.Service;

import Cuponera.Entity.Cupones;
import Cuponera.Entity.Prueba;
import Cuponera.Request.CuponesRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CuponeraService {
    List obtenerCupones();
//    String editarCuponesLote(CuponesRequest request);
    List<Cupones> mostrarPorLote(int idLote);
    String borrarPorLote(int idLote);

    Cupones guardar(CuponesRequest request);
    Cupones actualizar(CuponesRequest request);
    Cupones buscar(int id);
    String eliminar(int id);
    List mostrar();
}
