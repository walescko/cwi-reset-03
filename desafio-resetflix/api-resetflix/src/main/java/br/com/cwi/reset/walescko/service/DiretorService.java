package br.com.cwi.reset.walescko.service;

import br.com.cwi.reset.walescko.FakeDatabase;
import br.com.cwi.reset.walescko.mensagemExceptions.CadastroDuplicadoException;
import br.com.cwi.reset.walescko.mensagemExceptions.TipoDominioException;
import br.com.cwi.reset.walescko.models.Diretor;
import br.com.cwi.reset.walescko.request.DiretorRequest;
import br.com.cwi.reset.walescko.validator.Validador;
import java.util.List;


public class DiretorService {

    private FakeDatabase fakeDatabase;

    public DiretorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

    public void cadastrarDiretor(final DiretorRequest diretorRequest) throws Exception {
        new Validador().accept(diretorRequest.getNome(), diretorRequest.getDataNascimento(),
                diretorRequest.getAnoInicioAtividade(), TipoDominioException.DIRETOR);

        final List<Diretor> diretoresCadastrados = fakeDatabase.recuperaDiretores();

        for (Diretor diretorCadastrado : diretoresCadastrados){
            if (diretorCadastrado.getNome().equalsIgnoreCase(diretorRequest.getNome())){
                throw new CadastroDuplicadoException(TipoDominioException.DIRETOR.getSingular(), diretorRequest.getNome());
            }
        }

        final Integer idGerado = diretoresCadastrados.size() + 1;

        final Diretor diretor = new Diretor(idGerado, diretorRequest.getNome(), diretorRequest.getDataNascimento(),
                diretorRequest.getAnoInicioAtividade());

        fakeDatabase.persisteDiretor(diretor);
    }



}
