/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.estado;

import br.edu.utfpr.filme.Exemplar;

/**
 *
 * @author utfpr
 */
public class Disponivel implements Estado{
    
    private Exemplar exemplar;

    public Disponivel(Exemplar exemplar) {
        this.exemplar = exemplar;
    }  
    
    @Override
    public void emprestar() {
        System.out.println("Filme emprestado com sucesso");
        exemplar.setE(new Emprestado());
    }
    
    @Override
    public void devolver() {
        System.out.println("Erro: Filme está disponível, não é possível devolver");
    }
}
