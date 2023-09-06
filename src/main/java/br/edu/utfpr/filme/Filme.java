/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.filme;

/**
 *
 * @author azevedo
 */
public class Filme {

    private String nome;
    private String genero;

    public Filme(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public void mostrarFilme() {
        System.out.println("Nome: " + nome
                + " Genero: " + genero);
    }
}
