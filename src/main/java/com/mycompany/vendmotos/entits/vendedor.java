/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendmotos.entits;

/**
 *
 * @author aluno
 */
public class vendedor {
  private String nome;
  private int telefone;

  
    public vendedor(String nome, String ano, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public vendedor(){
        this.nome = "";
        this.telefone = 0;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    } 
 
  
  
}
