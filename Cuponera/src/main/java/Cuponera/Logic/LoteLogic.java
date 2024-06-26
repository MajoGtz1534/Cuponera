package Cuponera.Logic;

import Cuponera.Entity.Lote;
import Cuponera.Repository.LoteRepository;
import Cuponera.Service.LoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class LoteLogic implements LoteService {

    @Autowired
    LoteRepository repository;

    @Override
    public List<Lote> GetAll(){

        List<Lote> asd = repository.GetAllLotes();
        List<Lote> asdqawe = repository.findAll();

        var tt = "";
        return repository.GetAllLotes();
    }
}
