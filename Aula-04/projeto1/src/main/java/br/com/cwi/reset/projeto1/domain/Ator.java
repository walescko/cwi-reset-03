package br.com.cwi.reset.projeto1.domain;

import java.time.LocalDate;

public class Ator extends Person {

    private Integer numeroOscars;

    public Ator(String name, LocalDate nascimento, Integer numeroOscars, Genero genero) {
        super(name, nascimento, genero);
        this.numeroOscars = numeroOscars;
    }

    public Ator(){

    }

    public Integer getNumeroOscars() {
        return numeroOscars;
    }

    public void setNumeroOscars(Integer numeroOscars) {
        this.numeroOscars = numeroOscars;
    }
}


}
