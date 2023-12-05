package br.org.fundatec.aula03.Controller;

import br.org.fundatec.aula03.Model.Loja;
import br.org.fundatec.aula03.Service.LojaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/lojas")
public class LojaController {
    private final LojaService lojaService;

    public LojaController(LojaService lojaService) {
        this.lojaService = lojaService;
    }

    @PostMapping
    public Loja create(@RequestBody Loja loja) {
    return lojaService.create(loja);


    }


}
