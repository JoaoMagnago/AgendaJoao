/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import controle.SessaoManageBean;
import java.util.Date;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import modelo.Pessoa;

/**
 *
 * @author alunodev06
 */
public class AutorizaListener implements PhaseListener{

    @Override
    public void afterPhase(PhaseEvent event) {
        FacesContext c = event.getFacesContext();
        String paginaAtual = c.getViewRoot().getViewId();
        boolean isLoginPage = paginaAtual.lastIndexOf("login.xhtml") > -1;
        
        SessaoManageBean sessao = c.getApplication().evaluateExpressionGet(c, "#{SessaoManageBean}", SessaoManageBean.class);
        Pessoa pessoaLogada = sessao.getPessoaLogada();
        if(!isLoginPage && pessoaLogada == null){
            NavigationHandler nh = c.getApplication().getNavigationHandler();
            nh.handleNavigation(c, null, "falha_autenticacao");
        }
    }

    @Override
    public void beforePhase(PhaseEvent event) {
        
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.RESTORE_VIEW;
    }
    
}
