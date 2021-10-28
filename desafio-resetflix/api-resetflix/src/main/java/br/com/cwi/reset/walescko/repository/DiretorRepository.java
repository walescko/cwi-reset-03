package br.com.cwi.reset.walescko.repository;

import br.com.cwi.reset.walescko.models.Diretor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiretorRepository extends CrudRepository<Diretor, Integer> {

}
