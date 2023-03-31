/*
 *Classe : Pessoa
 *Analista Responsável:  Pedro
 *Desenvolvedor: João Contini
*/
package controller;

import java.util.*;

public class Pessoa {

    public String NomeSobrenome;
    protected String CPF;
    public int registroGeral;
    public String tipoFuncao;
    public Date dataNasc;
    public Date dataRegistro;
    public String email;
    private String telefone;
    public boolean pcd;
    private String genero;
    private String endereco;

    public void adicinarPessoa() {

    }

    public void editarPessoa() {

    }

    public void excluirPessoa() {

    }

    public String getTelefone() {
        return telefone;
    }

    public String getGenero() {
        return genero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setTelefone() {
        this.telefone = telefone;
    }

    public void setGenero() {
        this.genero = genero;
    }

    public void setEndereco() {
        this.endereco = endereco;
    }
}
