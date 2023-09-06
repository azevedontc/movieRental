/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.filme;

/**
 *
 * @author azevedo
 */
public class Midia {

    private String tipo;
    private Filme filme;

    public String getTipo() {
        return tipo;
    }

    public Filme getFilme() {
        return filme;
    }

    public Midia(String tipo, Filme filme) {
        this.tipo = tipo;
        this.filme = filme;
    }

    public void mostrar() {
        System.out.println("Mídia: " + tipo);
    }
}
