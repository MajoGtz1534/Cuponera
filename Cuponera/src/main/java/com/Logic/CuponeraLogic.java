package com.Logic;

import com.Entity.Cupones;
import com.Repository.CuponeraRepository;
import com.Request.CuponesRequest;
import com.Service.CuponeraService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CuponeraLogic implements CuponeraService {

    @Autowired
    CuponeraRepository repository;

    @Override
    public List<Cupones> GetAllCupones() {
        List<Cupones> listaCupones = repository.findAll();
        return listaCupones;
    }

    @Override
    public String editarCuponesLote(CuponesRequest request) {

         repository.editarCuponesLote(request.getIdLote(), request.getFechaInicioVigencia(),request.getFechaFinVigencia(), request.getValor(), request.getCompraMinima(),request.getUsuarioUpdate(),request.getFechaUpdate());
        return("Eliminado Correctamente");

    }

    @Override
    public List<Cupones> mostrarPorLote(int idLote) {
        List<Cupones> cupones = repository.cuponesPorLote(idLote);
        return cupones;
    }

    @Override
    public String borrarPorLote(int idLote) {
        repository.borrarPorLote(idLote);
        return "Eliminado Correctamente";
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
