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
    public String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
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
    
    public String logar(){
        Pessoa p = iDToolsBDUsuario.verificar(this.login, this.senha);
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
    
    public String logout(){
        sessaoUsuario.setDataInicioSessao(null);
        sessaoUsuario.setPessoaLogada(null);
        return "login";
    }
}
