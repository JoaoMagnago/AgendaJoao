/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import DAO.PessoaDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.Pessoa;

/**
 *
 * @author joaoa
 */
@ManagedBean (name = "cadastroBean")
@RequestScoped
public class CadastroMB {
    private PessoaDAO pDAO = new PessoaDAO();
    private Pessoa pessoa = new Pessoa();
    private IDToolsBDUsuario db = new IDToolsBDUsuario();
    
    public String cadastrarPessoa(Pessoa p){
        db.cadastrar(p);
        pDAO.cadastrarPessoa(p);
        return "login.xhtml";
    }
}
