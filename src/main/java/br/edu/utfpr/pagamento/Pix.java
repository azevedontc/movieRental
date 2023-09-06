/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.pagamento;

/**
 *
 * @author utfpr
 */
public class Pix implements Pagamento{

    @Override
    public void pagar() {
        System.out.println("Pagamento efetuado com PIX");
    }
    
}
