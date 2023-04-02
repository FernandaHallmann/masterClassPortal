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

    public void adicinarPessoa(String NomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco) {
        this.NomeSobrenome = NomeSobrenome;
        this.CPF = CPF;
        this.registroGeral = registroGeral;
        this.tipoFuncao = tipoFuncao;
        this.dataNasc = dataNasc;
        this.dataRegistro = dataRegistro;
        this.email = email;
        this.telefone = telefone;
        this.pcd = pcd;
        this.genero = genero;
        this.endereco = endereco;
    }

    public void editarPessoa(String NomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco) {
        this.NomeSobrenome = NomeSobrenome;
        this.CPF = CPF;
        this.registroGeral = registroGeral;
        this.tipoFuncao = tipoFuncao;
        this.dataNasc = dataNasc;
        this.dataRegistro = dataRegistro;
        this.email = email;
        this.telefone = telefone;
        this.pcd = pcd;
        this.genero = genero;
        this.endereco = endereco;
    }

    public void excluirPessoa(String NomeSobrenome, String CPF, int registroGeral, String tipoFuncao, Date dataNasc, Date dataRegistro, String email, String telefone, boolean pcd, String genero, String endereco) {
        this.NomeSobrenome = null;
        this.CPF = null;
        this.registroGeral = (Integer) null;
        this.tipoFuncao = null;
        this.dataNasc = null;
        this.dataRegistro = null;
        this.email = null;
        this.telefone = null;
        this.pcd = (Boolean) null;
        this.genero = null;
        this.endereco = null;
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