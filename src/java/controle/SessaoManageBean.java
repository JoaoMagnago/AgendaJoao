/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Pessoa;

/**
 *
 * @author alunodev06
 */
@ManagedBean(name="SessaoManageBean")
@SessionScoped
public class SessaoManageBean {
    private Pessoa PessoaLogada;
    public Date dataInicioSessao;

    public Pessoa getPessoaLogada() {
        return PessoaLogada;
    }

    public void setPessoaLogada(Pessoa PessoaLogada) {
        this.PessoaLogada = PessoaLogada;
    }

    public Date getDataInicioSessao() {
        return dataInicioSessao;
    }

    public void setDataInicioSessao(Date dataInicioSessao) {
        this.dataInicioSessao = dataInicioSessao;
    }
    
}
