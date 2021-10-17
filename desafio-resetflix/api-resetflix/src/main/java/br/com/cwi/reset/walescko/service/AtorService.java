package br.com.cwi.reset.walescko.service;

import br.com.cwi.reset.walescko.mensagemExceptions.CadastroDuplicadoException;
import br.com.cwi.reset.walescko.mensagemExceptions.StatusCarreiraNaoInformadoException;
import br.com.cwi.reset.walescko.mensagemExceptions.TipoDominioException;
import br.com.cwi.reset.walescko.models.Ator;
import br.com.cwi.reset.walescko.FakeDatabase;
import br.com.cwi.reset.walescko.request.AtorRequest;
import br.com.cwi.reset.walescko.validator.Validador;

public class AtorService {

    private FakeDatabase fakeDatabase;

    public AtorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

    public void criarAtor(AtorRequest atorRequest) {
        new Validador().accept(atorRequest.getNome(), atorRequest.getDataNascimento(),
                atorRequest.getAnoInicioAtividade(), TipoDominioException.ATOR);

        if (atorRequest.getStatusCarreira() ==null){
            throw new StatusCarreiraNaoInformadoException();
        }

        final List<Ator> atoresCadastrados = fakeDatabase.recuperaAtores();

        for (Ator atorCadastrado : atoresCadastrados){
            if (atorCadastrado.getNome().equalsIgnoreCase(atorRequest.getNome())){
                throw new CadastroDuplicadoException(TipoDominioException.ATOR.getSingular(), atorRequest.getNome());
            }
        }

        final Integer idGerado = atoresCadastrados.size() + 1;

        final Ator ator = new Ator(idGerado, atorRequest.getNome(), atorRequest.getDataNascimento(), atorRequest.getStatusCarreira(),
                atorRequest.getAnoInicioAtividade());

        fakeDatabase.persisteAtor(ator);
    }
}