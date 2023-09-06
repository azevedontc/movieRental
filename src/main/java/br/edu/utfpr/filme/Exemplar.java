/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.filme;

import br.edu.utfpr.estado.Disponivel;
import br.edu.utfpr.estado.Estado;

/**
 *
 * @author azevedo
 */
public class Exemplar {
    int id;
    Midia midia;
    private Estado e;

    public void setE(Estado e) {
        this.e = e;
    }

    public void emprestar() {
        e.emprestar();
    }

    public void devolver() {
        e.devolver();
    }

    public Exemplar(int id, Midia midia) {
        this.id = id;
        this.midia = midia;
        e = new Disponivel(this);
    }

    public int getId() {
        return id;
    }

    public Midia getMidia() {
        return midia;
    }
    
    
}
