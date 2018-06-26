/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Isao Felipe Morigaki
 */
public class Cidade {
    private int id;
    private String nome;
    private List<Bairro> bairros;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(List<Bairro> bairros) {
        this.bairros = bairros;
    }

    public Cidade(int id, String nome, List<Bairro> bairros) {
        this.id = id;
        this.nome = nome;
        this.bairros = bairros;
    }

    public Cidade() {
    }
}
