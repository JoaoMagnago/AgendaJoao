/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import modelo.Contato;

/**
 *
 * @author joaoa
 */
public class ContatoDAO {
    public static ArrayList<Contato> listaContatos = new ArrayList<>();
    
    public ArrayList<Contato> getAll(){
        return this.listaContatos;
    }
    
    public void inserir(Contato contato){
        this.listaContatos.add(contato);
    }
    
    public void cadastrarContatoDAO(Contato contato){
        inserir(contato);
    }
    
    public List<Contato> listarContatoDAO(){
        return ContatoDAO.listaContatos;
    }
    
    public void removerContatoDAO(Contato contato){
        
    }
    
    public Contato consultarContatoDAO(String nomeBusca){
        return null;
    }

    public ContatoDAO() {
    }
}
