/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controle.LoginMB;
import java.util.Date;

/**
 *
 * @author alunodev06
 */
public class Pessoa {
    public String nome;
    private String telefone;
    private String endereco;
    private Date dataNasc;
    private String email;
    public Integer senha;

    public Pessoa() {
    }

    public Pessoa(Pessoa p) {
        this.nome = p.nome;
        this.telefone = p.telefone;
        this.endereco = p.endereco;
        this.dataNasc = p.dataNasc;
        this.email = p.email;
        this.senha = p.senha;
    }

    public Pessoa(LoginMB p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    
}
