package com.Logic;

import com.Entity.Cupones;
import com.Repository.CuponeraRepository;
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
}
