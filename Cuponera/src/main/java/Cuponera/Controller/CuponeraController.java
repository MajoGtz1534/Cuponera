package Cuponera.Controller;

import Cuponera.Entity.Cupones;
import Cuponera.Entity.Prueba;
import Cuponera.Service.CuponeraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Cuponera")
public class CuponeraController {

    @Autowired
    CuponeraService services;

    @GetMapping("/obtenerTodosLosCupones")
    public ResponseEntity<List<Cupones>> mostrarCupones(){
        List<Cupones> listaCupones = services.obtenerCupones();
        return new ResponseEntity<List<Cupones>>(listaCupones, HttpStatus.OK);
    }

    @GetMapping("/cuponesPorLote/{idLote}")
    public ResponseEntity<List<Cupones>> cuponesLote(@PathVariable int idLote){
        List<Cupones> cupones = services.mostrarPorLote(idLote);
        return new ResponseEntity<List<Cupones>>(cupones,HttpStatus.OK);
    }

//    @PutMapping("/actualizarCuponesPorLote")
//    public ResponseEntity<String> actualizarCuponesPorLote(@RequestBody CuponesRequest request){
//         String respuestaCupon = services.editarCuponesLote(request);
//         return new ResponseEntity<String>(respuestaCupon,HttpStatus.OK);
//    }

    @DeleteMapping("/borrarPorLote/{idLote}")
    public ResponseEntity<String> borrarPorLote(@PathVariable int idLote){
        String respuestaCupon = services.borrarPorLote(idLote);
        return new ResponseEntity<String>(respuestaCupon,HttpStatus.OK);
    }

}
