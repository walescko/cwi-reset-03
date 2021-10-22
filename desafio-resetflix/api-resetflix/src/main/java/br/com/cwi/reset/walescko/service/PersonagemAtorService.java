package br.com.cwi.reset.walescko.service;

import br.com.cwi.reset.walescko.FakeDatabase;
import br.com.cwi.reset.walescko.models.PersonagemAtor;
import br.com.cwi.reset.walescko.request.PersonagemRequest;

import java.util.ArrayList;
import java.util.List;

public class PersonagemAtorService {

    private FakeDatabase fakeDatabase;

    public PersonagemAtorService(FakeDatabase fakeDatabase){
        this.fakeDatabase = fakeDatabase;
    }

    public void cadastrarPersoangemAtor(PersonagemRequest personagemRequest) throws Exception{

    }

    public List<PersonagemAtor> consultarPersonagemAtor(String nome) throws Exception{
        List<PersonagemAtor> personagens = new ArrayList<>();
        return personagens;
    }
}
