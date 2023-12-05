package br.org.fundatec.aula03.Repository;

import br.org.fundatec.aula03.Model.Loja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LojaRepository extends JpaRepository<Loja, Long> {


}
