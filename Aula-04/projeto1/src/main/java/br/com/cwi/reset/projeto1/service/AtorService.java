package br.com.cwi.reset.projeto1.service;

import br.com.cwi.reset.projeto1.domain.Ator;
import br.com.cwi.reset.projeto1.domain.Ator;
import br.com.cwi.reset.projeto1.exception.AtorJaExistenteException;
import br.com.cwi.reset.projeto1.exception.AtorNaoExistenteException;
import br.com.cwi.reset.projeto1.repository.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AtorService {
    @Autowired
    private AtorRepository repository;//


    public Ator buscarAtorPeloNome(String nome) throws AtorNaoExistenteException {
        Ator ator = repository.findByName(nome);
        if (ator == null) {
            throw new AtorNaoExistenteException("Ator com o nome" + nome + " não existe.");
        }
        return ator;

    }

    public Ator salvar(Ator ator) throws AtorJaExistenteException {
        Ator atorJaExistente = repository.findByName(ator.getName());

        if (atorJaExistente !=null){
            throw new AtorJaExistenteException("Já existe ator com esse nome.");
        }
        return repository.save(ator);
    }

    public Ator cadastrarPet(Ator ator) throws AtorJaExistenteException {
        Ator atorJaExistente = repository.findByName(ator.getName());

        if (atorJaExistente != null) {
            throw new AtorJaExistenteException("Já temos um ator com esse nome");
        }
        return repository.save(ator);
    }

    public List<Ator> listarAtoress() {return repository.findAll();}

    public void deletarAtor(String nome) throws AtorNaoExistenteException {
        Ator ator = repository.findByName(nome);
        if (ator == null) {
            throw new AtorNaoExistenteException("Ator com o nome " + nome + " não existe");
        }
        repository.delete(ator);
    }

    public Ator atualizar(Ator ator) throws AtorNaoExistenteException {
        Ator atorJaCadastrado = repository.findByName(ator.getName());
        if (atorJaCadastrado == null) {
            throw new AtorNaoExistenteException("Ator com o nome " + ator.getName() + " não existe");
        }
        if (!repository.existsById((ator.getId()))){
            throw new AtorNaoExistenteException("Ator inexistente");
        }
        return repository.save(ator);
    }

    public List<Ator> listarTodos(){ return (List<Ator>) repository.findAll();}

    public List<Ator> listarAtor() {
    }
}
