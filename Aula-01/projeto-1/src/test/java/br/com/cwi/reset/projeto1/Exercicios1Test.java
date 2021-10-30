package br.com.cwi.reset.projeto1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicios1Test {

    Exercicios1 somarLista = new Exercicios1();

    //Exercicio 2 - Testes de Soma
//    @Test
//    public void testSomarListaInteirosPositovos(){
//        //Arrange
//        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
//        int somaExpect = 15;
//
//        //Action
//        Integer somaResultado = somarLista.somarLista(numeros);
//
//        //Assert
//        Assertions.assertEquals(somaExpect, somaResultado);
//
//    }
//
//    @Test
//    public void testSomarListaInteirosPositovos1Negativo(){
//        //Arrange
//        List<Integer> numeros = Arrays.asList(5, 6, 4, 7, -10);
//        int somaExpect = 12;
//
//        //Action
//        Integer somaResultado = somarLista.somarLista(numeros);
//
//        //Assert
//        Assertions.assertEquals(somaExpect, somaResultado);
//
//    }
//    @Test
//    public void testSomarListaInteirosPositovos3Negativo(){
//        //Arrange
//        List<Integer> numeros = Arrays.asList(5, 4, -8, -9, -10);
//        int somaExpect = -18;
//
//        //Action
//        Integer somaResultado = somarLista.somarLista(numeros);
//
//        //Assert
//        Assertions.assertEquals(somaExpect, somaResultado);
//    }
//    @Test
//    public void testSomarListaInteiros3Negativos(){
//        //Arrange
//        List<Integer> numeros = Arrays.asList(-8, -9, -10);
//        int somaExpect = -27;
//
//        //Action
//        Integer somaResultado = somarLista.somarLista(numeros);
//
//        //Assert
//        Assertions.assertEquals(somaExpect, somaResultado);
//    }
//
//    @Test
//    public void testSomarListaDeZeros(){
//        //Arrange
//        List<Integer> numeros = Arrays.asList(0, 0, 0);
//        int somaExpect = 0;
//
//        //Action
//        Integer somaResultado = somarLista.somarLista(numeros);
//
//        //Assert
//        Assertions.assertEquals(somaExpect, somaResultado);
//    }
//    @Test
//    public void testSomarListaVazia(){
//        //Arrange
//        List<Integer> numeros = new ArrayList<>();
//        int somaExpect = 0;
//
//        //Action
//        Integer somaResultado = somarLista.somarLista(numeros);
//
//        //Assert
//        Assertions.assertEquals(somaExpect, somaResultado);
//    }
//
//    //Testes de média
//    @Test
//    public void testCalcularMedia(){
//        //Arrange
//        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
//        Double mediaExpect = 3.0;
//
//        //Action
//        Double mediaResultado;
//        mediaResultado = somarLista.calcularMedia(numeros);
//
//        //Assert
//        Assertions.assertEquals(mediaExpect, mediaResultado);
//    }
//    @Test
//    public void testCalcularMediaCom1Negativo(){
//        //Arrange
//        List<Integer> numeros = Arrays.asList(-2,4,6,8,10);
//        Double mediaExpect = 5.2;
//
//        //Action
//        Double mediaResultado;
//        mediaResultado = somarLista.calcularMedia(numeros);
//
//        //Assert
//        Assertions.assertEquals(mediaExpect, mediaResultado);
//    }
//    @Test
//    public void testCalcularMediaCom3Negativo2Positivo(){
//        //Arrange
//        List<Integer> numeros = Arrays.asList(-2,-4,-6,8,10);
//        Double mediaExpect = 1.2;
//
//        //Action
//        Double mediaResultado;
//        mediaResultado = somarLista.calcularMedia(numeros);
//
//        //Assert
//        Assertions.assertEquals(mediaExpect, mediaResultado);
//    }
//
//    @Test
//    public void testCalcularMediaCom3Negativos(){
//        //Arrange
//        List<Integer> numeros = Arrays.asList(-2,-4,-6);
//        Double mediaExpect = -4.0;
//
//        //Action
//        Double mediaResultado;
//        mediaResultado = somarLista.calcularMedia(numeros);
//
//        //Assert
//        Assertions.assertEquals(mediaExpect, mediaResultado);
//    }
//    @Test
//    public void testCalcularMediaListaDeZeros(){
//        //Arrange
//        List<Integer> numeros = Arrays.asList(0, 0, 0);
//        Double mediaExpect = 0.0;
//
//        //Action
//        Double mediaResultado = somarLista.calcularMedia(numeros);
//        //Assert
//        Assertions.assertEquals(mediaExpect, mediaResultado);
//    }
//    @Test
//    public void testCalcularMediaListaVazia(){
//        //Arrange
//        List<Integer> numeros = new ArrayList<>();
//        int mediaExpect = 0;
//
//        //Action
//        Throwable exception = Assertions.assertThrows(ArithmeticException.class, () -> somarLista.calcularMedia(numeros));
////        Integer mediaResultado = somarLista.somarLista(numeros);
//
//        //Assert
//        Assertions.assertEquals("Erro Matemático", exception.getMessage());
////        Assertions.assertEquals(mediaExpect, mediaResultado);
//    }

    //Teste Ordenação Numérica - exercício
    @Test
    public void testOrdenarListaComInteirosPositivos() {
        //Arrange
        List<Integer> numeros = Arrays.asList(25,55,2);
        List<Integer> ordenada = Arrays.asList(2,25,55);

        //Action
        List<Integer> resultado = somarLista.ordenarLista(numeros);

        //Assert
        Assertions.assertEquals(ordenada, resultado);
    }
    @Test
    public void testOrdenarListaComNull() {
//        
        //Action
        Assertions.assertThrows(NullPointerException.class, () -> somarLista.ordenarLista(null));
    }
}
