package br.com.cwi.reset.projeto1.service;

import br.com.cwi.reset.projeto1.domain.Pet;
import br.com.cwi.reset.projeto1.exception.PetJaExistenteException;
import br.com.cwi.reset.projeto1.exception.PetNaoExistenteException;
import br.com.cwi.reset.projeto1.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository repository;//


    public Pet buscarPetPeloNome(String nome) throws PetNaoExistenteException {
        Pet pet = repository.findByNome(nome);
        if (pet == null) {
            throw new PetNaoExistenteException("Pet com o nome" + nome + " não existe.");
        }
        return pet;

    }

    public Pet salvar(Pet pet) throws PetJaExistenteException{
        Pet petJaExistente = repository.findByNome(pet.getNome());

        if (petJaExistente !=null){
            throw new PetJaExistenteException("Já existe pet com esse nome.");
        }
        return repository.save(pet);
    }

    public Pet cadastrarPet(Pet pet) throws PetJaExistenteException {
        Pet petJaExistente = repository.findByNome(pet.getNome());

        if (petJaExistente != null) {
            throw new PetJaExistenteException("Já temos um pet com esse nome");
        }
        return repository.save(pet);
    }

    public List<Pet> listarPets() {return repository.findAll();}

    public void deletarPet(String nomePet) throws PetNaoExistenteException {
        Pet pet = repository.findByNome(nomePet);
        if (pet == null) {
            throw new PetNaoExistenteException("Pet com o nome " + nomePet + " não existe");
        }
        repository.delete(pet);
    }

    public Pet atualizar(Pet pet) throws PetNaoExistenteException {
        Pet petJaCadastrado = repository.findByNome(pet.getNome());
        if (petJaCadastrado == null) {
            throw new PetNaoExistenteException("Pet com o nome " + pet.getNome() + " não existe");
        }
        if (!repository.existsById((pet.getId()))){
            throw new PetNaoExistenteException("Pet inexistente");
        }
        return repository.save(pet);
    }

    public List<Pet> listarTodos(){ return (List<Pet>) repository.findAll();}


}

