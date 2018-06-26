/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import modelo.Contato;
import modelo.Pessoa;

/**
 *
 * @author alunodev06
 */
@ManagedBean(name="SessaoManageBean")
@SessionScoped
public class SessaoManageBean {
    private Pessoa PessoaLogada;
    private Date dataInicioSessao;
    private Contato contato = null;

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

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
    //Internacionalização----------------------------
    private static final long serialVersionUID = 1L;
    private String locale;

    private static Map<String,Object> countries;
       static {

       countries = new LinkedHashMap<String,Object>();
       countries.put("Portuguese", Locale.getDefault());
       countries.put("English", Locale.ENGLISH);
       countries.put("Japanese", Locale.JAPANESE);
    }

    public Map<String, Object> getCountries() {
       return countries;
    }

    public String getLocale() {
       return locale;
    }

    public void setLocale(String locale) {
       this.locale = locale;
    }

    //value change event listener
    public void localeChanged(ValueChangeEvent e) {
       String newLocaleValue = e.getNewValue().toString();

       for (Map.Entry<String, Object> entry : countries.entrySet()) {

          if(entry.getValue().toString().equals(newLocaleValue)) {
             FacesContext.getCurrentInstance()
                .getViewRoot().setLocale((Locale)entry.getValue());         
          }
       }
    }
}
