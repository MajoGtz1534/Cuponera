package Cuponera.Controller;

import Cuponera.Entity.Cupones;
import Cuponera.Entity.Lote;
import Cuponera.Service.LoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/Lote")
public class LoteController {

    @Autowired
    LoteService service;

    //List<Lote>
    @GetMapping("/GetAll")
    public ResponseEntity<List<Lote>> mostrarCupones(){
        return new ResponseEntity<List<Lote>>(service.GetAll(), HttpStatus.OK);
    }
}
