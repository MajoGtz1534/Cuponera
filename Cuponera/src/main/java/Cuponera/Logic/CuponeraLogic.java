package Cuponera.Logic;

import Cuponera.Entity.Cupones;
import Cuponera.Entity.Lote;
import Cuponera.Repository.CuponeraRepository;
import Cuponera.Repository.LoteRepository;
import Cuponera.Request.CuponRequestEditar;
import Cuponera.Request.CuponesRequest;
import Cuponera.Service.CuponeraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CuponeraLogic implements CuponeraService {

    @Autowired
    CuponeraRepository repositoryCupon;

    @Autowired
    LoteRepository repositoryLote;

    @Override
    public String editarCuponesPorLote(int id_lote, CuponRequestEditar request) {

        repositoryCupon.editarCuponesLote(id_lote, request.getFecha_inicio_vigencia(),request.getFecha_fin_vigencia(), request.getCompra_minima(), request.getUsuario_update(), request.getFecha_update());
        return("Actualizado Correctamente");

    }


    @Override
    public String borrarPorLote(int id_lote) {
        repositoryCupon.borrarPorLote(id_lote);
        return "Eliminado Correctamente";
    }

    @Override
    public List<Cupones> obtenerCupones() {
        return repositoryCupon.findAll();
    }


    @Override
    public List<Cupones> mostrarPorLote(int id_lote) {
        return repositoryCupon.cuponesPorLote(id_lote);
    }


    @Override
    public String crearCupon(CuponesRequest request) {
        Lote lote = new Lote();
        lote.setIdLote(0);
        lote.setDescripcion("Prueba2");
        lote.setEstatus(true);
        repositoryLote.save(lote);


        List<Cupones> listaCupones = new ArrayList<Cupones>();

        for (int i = 1; i <= request.getCantidad_cupones(); i++) {
            Cupones cupon = new Cupones();

            cupon.setCodigo("asd");
            cupon.setId_lote(lote.getId_lote());
            cupon.setValor(request.getValor());
            cupon.setCompra_minima(request.getCompra_minima());
            cupon.setNum_referencia(request.getNum_referencia());
            cupon.setNum_celular(request.getNum_celular());
            cupon.setDescripcion(request.getDescripcion());
            cupon.setFecha_fin_vigencia(request.getFecha_fin_vigencia());
            cupon.setFecha_inicio_vigencia(request.getFecha_inicio_vigencia());

            listaCupones.add(cupon);
        }

        repositoryCupon.saveAll(listaCupones);

        return "Creado Correctamente";
    }

    @Override
    public Cupones actualizar(int id_lote, CuponesRequest request) {
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
