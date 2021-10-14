package br.com.cwi.reset.walescko;

import br.com.cwi.reset.walescko.mensagemExceptions.AtorAnoInicioAtividadeException;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class AtorService{

    private FakeDatabase fakeDatabase;

    public AtorService(FakeDatabase fakeDatabase){
        this.fakeDatabase = fakeDatabase;
    }

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
