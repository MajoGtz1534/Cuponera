package com.Service;

import com.Entity.Cupones;
import com.Request.CuponesRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CuponeraService {
    List<Cupones> GetAllCupones();
    String editarCuponesLote(CuponesRequest request);

    Cupones guardar(CuponesRequest request);
    Cupones actualizar(CuponesRequest request);
    Cupones buscar(int id);
    String eliminar(int id);
    List mostrar();
}
