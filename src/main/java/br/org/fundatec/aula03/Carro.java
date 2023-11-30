package br.org.fundatec.aula03;

import jakarta.persistence.*;
import org.hibernate.Length;

import java.util.Objects;
import java.util.logging.Level;

@Entity
public class Carro {

    @Id
    @Column(length = 8)
    private  String placa;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Cor cor;


    @Column(length = 200)
    private  String marca;

    private Integer ano;

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(placa, carro.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }
}
