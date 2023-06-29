/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendmotos.entits;

/**
 *
 * @author aluno
 */
public class Moto {
  private String modelo;
  private int codigoM;
  private boolean disponibilidade;

    public Moto(String modelo, int codigoM, boolean disponibilidade) {
        this.modelo = modelo;
        this.codigoM = codigoM;
        this.disponibilidade = disponibilidade;
    }
    public Moto() {
        this.modelo = "";
        this.codigoM = 0;
        this.disponibilidade = true;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getCodigoM() {
        return codigoM;
    }
    public void setCodigoM(int codigoM) {
        this.codigoM = codigoM;
    }
    public boolean isDisponibilidade() {
        return disponibilidade;
    }
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
}

