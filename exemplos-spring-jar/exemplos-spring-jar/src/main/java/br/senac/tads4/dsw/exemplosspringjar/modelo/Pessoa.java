/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads4.dsw.exemplosspringjar.modelo;

/**
 *
 * @author jonata.hmoliveira
 */
public class Pessoa {

    private String nome;

    private int idade;

    private int sexo;

    private String[] preferencias;

    private boolean contato;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the sexo
     */
    public int getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the preferencias
     */
    public String[] getPreferencias() {
        return preferencias;
    }

    /**
     * @param preferencias the preferencias to set
     */
    public void setPreferencias(String[] preferencias) {
        this.preferencias = preferencias;
    }

    /**
     * @return the contato
     */
    public boolean isContato() {
        return contato;
    }

    /**
     * @param contato the contato to set
     */
    public void setContato(boolean contato) {
        this.contato = contato;
    }

}
