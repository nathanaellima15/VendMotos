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
  private String Usuario;
  private String senha;

    public vendedor(String nome, int telefone, String Usuario, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.Usuario = Usuario;
        this.senha = senha;
    }
    public vendedor() {
        this.nome = "";
        this.telefone = 0;
        this.Usuario = "";
        this.senha = "";
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
    public String getUsuario() {
        return Usuario;
    }
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

}
