package br.com.cwi.reset.walescko.repository;


import br.com.cwi.reset.walescko.models.Ator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtorRepository extends CrudRepository<Ator, Integer> {

}
