package br.com.cwi.reset.walescko;

import java.time.LocalDate;

public class AtorService{

    private FakeDatabase fakeDatabase;
    private Ator ator;

    public AtorService(FakeDatabase fakeDatabase){
        this.fakeDatabase = fakeDatabase;
    }

    public void criarAtor(String nome, LocalDate dataNascimento, LocalDate inicioAtividade, StatusCarreira statusCarreira, String id){
        try {
        Ator ator = new Ator(nome, dataNascimento, inicioAtividade, statusCarreira, id);
        } catch (RegrasExceptionAtor e){
            System.out.println(e.getMessage());
        }

        ;
    }



    }
