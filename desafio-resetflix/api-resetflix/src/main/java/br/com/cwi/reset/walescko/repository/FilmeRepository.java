package br.com.cwi.reset.walescko.repository;

import br.com.cwi.reset.walescko.models.Filme;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends CrudRepository<Filme, Integer> {

}
