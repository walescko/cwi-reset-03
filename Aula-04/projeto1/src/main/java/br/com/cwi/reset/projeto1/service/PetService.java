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

    public Pet cadastrarPet(Pet pet) throws PetJaExistenteException {
        Pet petJaExistente = repository.buscarPetPeloNome(pet.getNome());

        if (petJaExistente != null) {
            throw new PetJaExistenteException("Já temos um pet com esse nome");
        }
        return repository.salvar(pet);
    }


    public Pet salvar(Pet pet) throws PetJaExistenteException{
        Pet petJaExistente = repository.buscarPetPeloNome(pet.getNome());
        
        if (petJaExistente !=null){
            throw new PetJaExistenteException("Já existe pet com esse nome.");
        }
        return repository.salvar(pet);
    }
    
    public List<Pet> listarPets() {return repository.findAll();}

    public Pet buscarPetPeloNome(String nome) throws PetNaoExistenteException {
        Pet pet = repository.buscarPetPeloNome(nome);
        if (pet == null) {
            throw new PetNaoExistenteException("Pet com o nome" + nome + " não existe.");
        }
        return pet;

    }
    public void deletarPet(String nomePet) throws PetNaoExistenteException {
        Pet pet = repository.buscarPetPeloNome(nomePet);
        if (pet == null) {
            throw new PetNaoExistenteException("Pet com o nome " + nomePet + " não existe");
        }
        repository.deletar(pet);
    }

    public Pet atualizarPet(Pet pet) throws PetNaoExistenteException {
        Pet petJaCadastrado = repository.buscarPetPeloNome(pet.getNome());
        if (petJaCadastrado == null) {
            throw new PetNaoExistenteException("Pet com o nome " + pet.getNome() + " não existe");
        }
        return repository.atualizarPet(pet);
    }


}

