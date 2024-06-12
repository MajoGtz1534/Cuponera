package Cuponera.Logic;

import Cuponera.Entity.Cupones;
import Cuponera.Entity.Prueba;
import Cuponera.Repository.CuponeraRepository;
import Cuponera.Request.CuponesRequest;
import Cuponera.Service.CuponeraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuponeraLogic implements CuponeraService {

    @Autowired
    CuponeraRepository repository;


//    @Override
//    public String editarCuponesLote(CuponesRequest request) {
//
//         repository.editarCuponesLote(request.getIdLote(), request.getFechaInicioVigencia(),request.getFechaFinVigencia(), request.getValor(), request.getCompraMinima(),request.getUsuarioUpdate(),request.getFechaUpdate());
//        return("Eliminado Correctamente");
//
//    }


    @Override
    public String borrarPorLote(int idLote) {
        repository.borrarPorLote(idLote);
        return "Eliminado Correctamente";
    }

    @Override
    public List<Cupones> obtenerCupones() {
        return repository.findAll();
    }

    @Override
    public List<Cupones> mostrarPorLote(int idLote) {
        return repository.cuponesPorLote(idLote);
    }

    @Override
    public Cupones guardar(CuponesRequest request) {
        return null;
    }

    @Override
    public Cupones actualizar(CuponesRequest request) {
        return null;
    }

    @Override
    public Cupones buscar(int id) {
        return null;
    }

    @Override
    public String eliminar(int id) {
        return "";
    }

    @Override
    public List mostrar() {
        return List.of();
    }
}
