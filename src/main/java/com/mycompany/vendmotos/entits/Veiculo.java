/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendmotos.entits;

/**
 *
 * @author aluno
 */
public class Veiculo {
  private String modelo;
  private String fabricante;
  private String Ano;
  private String Status;
  private String Tipo;
  private String precomedio;
  private String precovenda; 

    public Veiculo(String modelo, String fabricante, String Ano, String Status, String Tipo, String precomedio, String precovenda) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.Ano = Ano;
        this.Status = Status;
        this.Tipo = Tipo;
        this.precomedio = precomedio;
        this.precovenda = precovenda;
    }
    public Veiculo() {
        this.modelo = "";
        this.fabricante = "";
        this.Ano = "";
        this.Status = "";
        this.Tipo = "";
        this.precomedio = "";
        this.precovenda = "";
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getAno() {
        return Ano;
    }
    public void setAno(String Ano) {
        this.Ano = Ano;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String Status) {
        this.Status = Status;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    public String getPrecomedio() {
        return precomedio;
    }
    public void setPrecomedio(String precomedio) {
        this.precomedio = precomedio;
    }
    public String getPrecovenda() {
        return precovenda;
    }
    public void setPrecovenda(String precovenda) {
        this.precovenda = precovenda;
    }
  
  
}

