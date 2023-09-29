/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.emprestimo;

import br.edu.utfpr.filme.Exemplar;
import java.util.ArrayList;

/**
 *
 * @author azevedo
 */
public class Emprestimo {
    private ArrayList<Exemplar> listaExemplares = new ArrayList<>();
    
    public void adicionar(Exemplar e){
        listaExemplares.add(e);
    }
    
    public void remover(Exemplar e){
        listaExemplares.remove(e);
    }
    
    // Caso esteja emprestado
    public void emprestar(){
        System.out.println("Emprestimo concluído");
        System.out.println("Filmes emprestados: ");
        for (Exemplar l : listaExemplares) {
            l.emprestar();
            System.out.println("Código do exemplar: " + l.getId()
              + "Midia: " + l.getMidia().getTipo()
              + "Filme: " + l.getMidia().getFilme().getNome());
        }
    }
}
