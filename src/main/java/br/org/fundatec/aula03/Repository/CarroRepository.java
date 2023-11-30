package br.org.fundatec.aula03.Repository;

import br.org.fundatec.aula03.Model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, String> {

}
