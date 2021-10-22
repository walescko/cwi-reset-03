package br.com.cwi.reset.walescko.service;

import br.com.cwi.reset.walescko.FakeDatabase;
import br.com.cwi.reset.walescko.mensagemExceptions.*;
import br.com.cwi.reset.walescko.models.Estudio;
import br.com.cwi.reset.walescko.request.EstudioRequest;
import br.com.cwi.reset.walescko.validator.ValidadorEstudio;

import java.util.ArrayList;
import java.util.List;


public class EstudioService {
    private FakeDatabase fakeDatabase;

    public EstudioService(final FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

    public void criarEstudio(EstudioRequest estudioRequest) throws Exception {
        new ValidadorEstudio().accept(estudioRequest.getNome(), estudioRequest.getDescricao(),
                estudioRequest.getDataCriacao(), estudioRequest.getStatusAtividade());
    }

        //        final List<Estudio> estudiosCadastrados = fakeDatabase.recuperaEstudios();
//
//        for (Estudio estudioCadastrado : estudiosCadastrados) {
//            if (estudioCadastrado.getNome().equalsIgnoreCase(estudioRequest.getNome())) {
//                throw new CadastroDuplicadoException();
//            }
//
//            final Integer idGerado = estudiosCadastrados.size() + 1;
//
//            final Estudio estudio = new Estudio(idGerado, estudioRequest.getNome(), estudioRequest.getDescricao(),
//                    estudioRequest.getDataCriacao(), estudioRequest.getStatusAtividade());
//
//            fakeDatabase.persisteEstudio(estudio);
//        }
//    }

    public List<Estudio> consultarEstudios(String filtroNome) throws Exception {
        List<Estudio> estudios = new ArrayList<>();
        return estudios;
    }
        //        fakeDatabase.recuperaEstudios();
//        if (estudios.isEmpty()) {
//            throw new ListaVaziaException(TipoDominioException.ESTUDIO.getSingular(), TipoDominioException.ESTUDIO.getPlural());
//        } else {
//            return estudios;
//        }
//    }
//
//    public List<Estudio> consultarEstudios(String filtroNome) throws Exception {
//        List<Estudio> estudios = fakeDatabase.recuperaEstudios();
//        if (estudios.isEmpty()) {
//            throw new ListaVaziaException(TipoDominioException.ESTUDIO.getSingular(), TipoDominioException.ESTUDIO.getPlural());
//        } else {
//            return estudios;
//        }
//    }

    public Estudio consultarEstudio (Integer id) throws Exception {
        return null;
    }
}