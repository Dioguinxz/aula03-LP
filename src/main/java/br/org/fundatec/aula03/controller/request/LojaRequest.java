package br.org.fundatec.aula03.controller.request;

import br.org.fundatec.aula03.model.Endereco;
import jakarta.persistence.*;

public class LojaRequest {

    private String nome;


    private  Integer numeroCarros;



    private Endereco endereco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroCarros() {
        return numeroCarros;
    }

    public void setNumeroCarros(Integer numeroCarros) {
        this.numeroCarros = numeroCarros;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
