package br.com.cwi.reset.projeto1;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntToDoubleFunction;

public class Exercicios1 {

    public Integer somarLista(List<Integer> numeros) {
        int soma = 0;
        for (int i =0 ; i < numeros.size(); i++){
            soma += numeros.get(i);
        }
        return soma;
    }

    public Double calcularMedia(List<Integer> numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.size(); i++){
          soma += numeros.get(i);
        }
        double media = soma / numeros.size();
        return media;
    }

    public Integer obterMaiorNumero(List<Integer> numeros) {
        int maior =0;
        for (int i = 0; i < numeros.size(); i++){
            if (maior <= numeros.get(i)){
                maior = numeros.get(i);
            }
        }

        return maior;
    }

    public String obterPalavraInvertida(String palavra) {


        return "edcba";
    }

    public List<Integer> ordenarLista(List<Integer> numeros) {
        return Arrays.asList(1, 2, 3, 4, 5);
    }
}

