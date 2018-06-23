/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import modelo.Pessoa;

/**
 *
 * @author alunodev06
 */
@ManagedBean(name="loginBean")
@RequestScoped
public class LoginMB {
    public String login;
    public Integer senha;
    public Pessoa pessoa = new Pessoa();

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }
    
    private IDToolsBDUsuario iDToolsBDUsuario = new IDToolsBDUsuario();
    
    @ManagedProperty(value="#{SessaoManageBean}")
    private SessaoManageBean sessaoUsuario;

    public SessaoManageBean getSessaoUsuario() {
        return sessaoUsuario;
    }

    public void setSessaoUsuario(SessaoManageBean sessaoUsuario) {
        this.sessaoUsuario = sessaoUsuario;
    }
    
    public String cadastrarPessoa(Pessoa p){
        
        return "login.xhtml";
    }
    
    public String logar(){
        Pessoa p = iDToolsBDUsuario.verificar(login, senha);
        if (p != null){
            sessaoUsuario.setPessoaLogada(p);
            Date date = new Date();
            sessaoUsuario.setDataInicioSessao(date);
            return "sucesso";
        }
        else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Falha no login", ""));
            return "fracasso";
        }
    }
    
    public String pularFora(){
        sessaoUsuario = null;
        return "falha_autenticacao";
    }
}