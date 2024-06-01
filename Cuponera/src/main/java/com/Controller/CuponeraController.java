package com.Controller;

import com.Entity.Cupones;
import com.Service.CuponeraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/Cuponera")
public class CuponeraController {

    @Autowired
    CuponeraService services;

    @GetMapping
    public List<Cupones> GetAllCupones(){
        List<Cupones> listaCupones = services.GetAllCupones();
        //return new ResponseEntity<List<Cupones>>(listaCupones, HttpStatus.OK);
        return null;
    }

}
