/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.devolucao;

import br.edu.utfpr.emprestimo.Emprestimo;
import br.edu.utfpr.pagamento.Pagamento;

/**
 *
 * @author utfpr
 */
public class Devolucao {
    private Emprestimo e;
    private Pagamento p;
    //private dataDevolucao

    public Devolucao(Emprestimo e) {
        this.e = e;
    }
    
    public void pagar() {
        p.pagar();
    }
    
    public void devolver(){
        System.out.println("Devolução efetuada com sucesso");
        pagar();
    }
    
    public void setP(Pagamento p) {
        this.p = p;
    }
        
}
