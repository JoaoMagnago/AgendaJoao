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
    private String email;
    public String senha;

    public Pessoa(String nome, String telefone, String endereco, String email, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.senha = senha;
    }

    public Pessoa() {
    }

    public Pessoa(Pessoa p) {
        this.nome = p.nome;
        this.telefone = p.telefone;
        this.endereco = p.endereco;
        this.email = p.email;
        this.senha = p.senha;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
