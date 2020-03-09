/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author SESI_SENAI
 */
public class Pessoa {

    String nome;
    int idade;
    long CPF;
    char sexo;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade,char sexo, long CPF) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.sexo = this.sexo;

    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char Sexo) {
        this.sexo = Sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public long getCPF() {
        return CPF;
    }

   
}