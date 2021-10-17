package br.com.cwi.reset.walescko;

import br.com.cwi.reset.walescko.models.Ator;
import br.com.cwi.reset.walescko.models.Diretor;

import java.util.ArrayList;
import java.util.List;


public class FakeDatabase {

    private List<Ator> atores = new ArrayList<>();

    private List<Diretor> diretores = new ArrayList<>();

    public void persisteAtor(Ator ator) {
        atores.add(ator);
    }

    public List<Ator> recuperaAtores() {
        return atores;
    }

    public void persisteDiretor(Diretor diretor) {
        diretores.add(diretor);
    }

    public List<Diretor> recuperaDiretores() {
        return diretores;
    }

}
