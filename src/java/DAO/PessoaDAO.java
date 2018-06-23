/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import modelo.Pessoa;

/**
 *
 * @author joaoa
 */
public class PessoaDAO {
    private static List<Pessoa> pessoa = new ArrayList<Pessoa>();

    public PessoaDAO() {
    }
    
    public static List<Pessoa> getPessoa() {
        return pessoa;
    }

    public static void setPessoa(List<Pessoa> pessoa) {
        PessoaDAO.pessoa = pessoa;
    }    
    
    public void cadastrarPessoa(Pessoa p){
        PessoaDAO.pessoa.add(p);
    }
}
