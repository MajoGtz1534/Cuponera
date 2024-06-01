package com.Service;

import com.Entity.Cupones;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CuponeraService {
    List<Cupones> GetAllCupones();
}
