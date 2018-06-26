/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import DAO.CidadeDAO;
import DAO.ContatoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import modelo.Cidade;
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
    
    @ManagedProperty(value="#{param.contatoE}")
    private String contatoE;
    
    private List<Cidade> cidades = new ArrayList<>();
    private int idCidade;
    private int idBairro;
    private Cidade cidade;

    public String getContatoE() {
        return contatoE;
    }

    public void setContatoE(String contatoE) {
        this.contatoE = contatoE;
    }
    
    @PostConstruct
    public void init() {
        if (listaContatosManage == null) {
            listaContatosManage = cDAO.listarContatoDAO();
        }
        if(contatoE != null){
            contato = cDAO.consultarContatoDAO(contatoE);
        }
        cidades = new CidadeDAO().getCidades();
    }
    
    public String cadastrarContatoManage(Contato c){
        cDAO.cadastrarContatoDAO(c);
        return "inicio.xhtml";
    }
    
    public String atualizarContatoManage(Contato c){
        cDAO.atualizar(c);
        return "listar.xhtml";
    }
    
    public ArrayList<Contato> listarContatoManage(){
        return cDAO.listaContatos;
    }
    
    public String deletarContato(Contato contato){
        cDAO.removerContatoDAO(contato);
        return "listar.xhtml";
    }
    
    public String consultarContatoManage(Contato c){
        if(listaContatosManage.contains(c))
            return "resultado.xhtml";
        return "consultar.xhtml";
    }
    
    public String detalharContato(){
        contato = cDAO.consultarContatoDAO(contatoE);
        return "atualizar.xhtml";
    }

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

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        cidade = new CidadeDAO().Buscar(idCidade);
        this.idCidade = idCidade;
    }

    public int getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(int idBairro) {
        this.idBairro = idBairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    
}
