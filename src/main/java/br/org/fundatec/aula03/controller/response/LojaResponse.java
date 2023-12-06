package br.org.fundatec.aula03.controller.response;

import br.org.fundatec.aula03.model.Endereco;

public class LojaResponse {

    private Long id;

    private String nome;

    private  Integer numeroCarros;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
