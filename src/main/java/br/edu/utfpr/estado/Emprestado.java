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
public class Emprestado implements Estado{
    
    @Override
    public void emprestar() {
        System.out.println("Erro: já está emprestado");
    }
    
    @Override
    public void devolver() {
        System.out.println("Devolução realizada com sucesso");
    }
}
