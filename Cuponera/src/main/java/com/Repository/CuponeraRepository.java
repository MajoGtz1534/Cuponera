package com.Repository;

import com.Entity.Cupones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CuponeraRepository extends JpaRepository<Cupones, Long> {


}
