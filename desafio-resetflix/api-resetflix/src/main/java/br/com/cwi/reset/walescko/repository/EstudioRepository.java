package br.com.cwi.reset.walescko.repository;

import br.com.cwi.reset.walescko.models.Estudio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends CrudRepository<Estudio, Integer> {

}
