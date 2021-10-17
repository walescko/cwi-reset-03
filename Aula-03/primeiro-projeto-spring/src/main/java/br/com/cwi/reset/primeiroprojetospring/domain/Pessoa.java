package br.com.cwi.reset.primeiroprojetospring.domain;

import org.apache.tomcat.jni.Local;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate nascimento;
    private Genero genero;

    public Pessoa(String nome, LocalDate nascimento, Genero genero) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
    }

    public void Apresentacao(){
        System.out.println(" ---- Casting ---- ");
        System.out.println("Nome: " + getNome());
        System.out.println("Nascimento: " +getNascimento());
        System.out.println("Genero: " + genero.getDescricao());
        System.out.println(" ----------------- ");
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public Genero getGenero() {
        return genero;
    }
}
