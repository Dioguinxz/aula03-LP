package br.org.fundatec.aula03.Model;

import jakarta.persistence.*;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    @Column(length = 80, nullable = false)
    private String rua;

    @Column(length = 80, nullable = false)
    private String bairro;

    @Column(length = 40, nullable = false)
    private String cidade;

    @Enumerated(EnumType.STRING)
    @Column(length = 2)
    private Estado estado;

    @Column(nullable = false)
    private Integer numero;

    @OneToOne(mappedBy = "endereco")
    @JoinColumn(name = "loja_id")
    private Loja loja;
}
