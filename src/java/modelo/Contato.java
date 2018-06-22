/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author joaoa
 */
public class Contato {
    private String nome;
    private String email;
    private String telefone;
    private String tipoTelefone;
    private String tipoContato;
    private Boolean favorito;

    public Contato() {
    }

    public Contato(String nome, String email, String telefone, String tipoTelefone, String tipoContato, Boolean favorito) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.tipoTelefone = tipoTelefone;
        this.tipoContato = tipoContato;
        this.favorito = favorito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(String tipoContato) {
        this.tipoContato = tipoContato;
    }

    public Boolean getFavorito() {
        return favorito;
    }

    public void setFavorito(Boolean favorito) {
        this.favorito = favorito;
    }
    
    
}
