/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import DAO.ContatoDAO;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.Contato;

/**
 *
 * @author joaoa
 */

@ManagedBean(name="contatoBean")
@RequestScoped
public class ContatoMB {
    private ContatoDAO cDAO = new ContatoDAO();
    private Contato contato = new Contato();
    private List<Contato> listaContatosManage = null;
    
    @PostConstruct
    public void init() {
        if (listaContatosManage == null) {
            listaContatosManage = cDAO.listarContatoDAO();
        }
    }
    
    public String cadastrarContatoManage(Contato c){
        listaContatosManage.add(c);
        cDAO.cadastrarContatoDAO(c);
        return "perfil.xhtml";
    }
    
    public String listarContatoManage(){
        return "listar.xhtml";
    }
    
    public String deletarContato(Contato contato){
        listaContatosManage.remove(contato);
        cDAO.removerContatoDAO(contato);
        return "listar.xhtml";
    }
    
    public String consultarContatoManage(Contato c){
        if(listaContatosManage.contains(c))
            return "resultado.xhtml";
        return "consultar.xhtml";
    }

//    public ContatoMB() {
//    }

    public ContatoDAO getcDAO() {
        return cDAO;
    }

    public void setcDAO(ContatoDAO cDAO) {
        this.cDAO = cDAO;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public List<Contato> getListaContatosManage() {
        return listaContatosManage;
    }

    public void setListaContatosManage(List<Contato> listaContatosManage) {
        this.listaContatosManage = listaContatosManage;
    }
    
    
}
