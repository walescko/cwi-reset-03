package br.com.cwi.reset.projeto1;

import java.util.Arrays;
import java.util.List;

public class Exercicios1 {

    public Integer somarLista(List<Integer> numeros) {
        int soma = 0;
        for (int i =0 ; i < numeros.size(); i++){
            soma += numeros.get(i);
        }
        return soma;
    }

    public Double calcularMedia(List<Integer> numeros) {
        double media = (double)somarLista(numeros) / numeros.size();
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

    public String obterPalavraInvertida(String palavra) { //baseado na solução apresentada.
        String inverse = "";
        for (int i = palavra.length()-1; i >= 0; i--){
            inverse += palavra.charAt(i);
        }
        return inverse;
    }

    public List<Integer> ordenarLista(List<Integer> numeros) {
        Integer[] pos = numeros.toArray(new Integer[numeros.size()]);
        Integer auxiliar = 0;
        for (int i = 0; i < numeros.size()-1; i++) {
            for (int j = i + 1; j < numeros.size(); j++) {

                if (pos[i] > pos[j]) {
                    auxiliar = pos[i];
                    pos[i] = pos[j];
                    pos[j] = auxiliar;
                }
            }
        }
        return Arrays.asList(pos);
    }
}

