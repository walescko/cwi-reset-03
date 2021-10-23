package br.com.cwi.reset.projeto1.repository;

import br.com.cwi.reset.projeto1.domain.Pet;

import java.util.List;

public interface PetRepository {

    Pet buscarPetPeloNome(String nome);

    Pet salvar(Pet pet);

    void deletar(Pet pet);

    Pet atualizarPet(Pet pet);

    List<Pet> findAll();

}
