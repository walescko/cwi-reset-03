package br.com.cwi.reset.walescko.service;

import br.com.cwi.reset.walescko.models.Ator;
import br.com.cwi.reset.walescko.FakeDatabase;
import br.com.cwi.reset.walescko.mensagemExceptions.AtorAnoInicioAtividadeException;
import br.com.cwi.reset.walescko.request.AtorRequest;

public class AtorService{

    private FakeDatabase fakeDatabase;

    public AtorService(FakeDatabase fakeDatabase){
        this.fakeDatabase = fakeDatabase;
    }
    //Aqui começa o que estamos fazendo
    public void criarAtor(AtorRequest atorRequest){
        Ator paraAtor = passagem(atorRequest);
        fakeDatabase.persisteAtor(paraAtor);
    }

    private Ator passagem (AtorRequest atorRequest){
        Ator ator = new Ator(atorRequest.getNome(),
                atorRequest.getDataNascimento(),
                atorRequest.getAnoInicioAtividade(),
                atorRequest.getStatusCarreira());
        return ator;
    }

    public void AnoInicioAtividade() throws AtorAnoInicioAtividadeException{

    }



}
