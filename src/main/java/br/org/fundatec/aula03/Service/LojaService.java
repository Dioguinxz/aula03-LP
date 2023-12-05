package br.org.fundatec.aula03.Service;

import br.org.fundatec.aula03.Model.Loja;
import br.org.fundatec.aula03.Repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LojaService {

    @Autowired
    private LojaRepository lojaRepository;

    public Loja create(Loja loja){
        return lojaRepository.save(loja);

    }

}
