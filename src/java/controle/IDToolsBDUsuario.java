/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import java.util.HashMap;
import modelo.Pessoa;

/**
 *
 * @author alunodev06
 */
class IDToolsBDUsuario {
    public static ArrayList<Pessoa> pessoasCadastradas = new ArrayList<Pessoa>();
    public IDToolsBDUsuario(){
        pessoasCadastradas.add(new Pessoa("joao", "123123123", "rua tal", "joao@joao.com", "123123"));
    }
    
    public void cadastrar(Pessoa p){
        pessoasCadastradas.add(p);
    }
    
    public Pessoa verificar(String login, String senha){
        Pessoa p = null;
        for(Pessoa i : pessoasCadastradas){
            if(i.getEmail() != null && i.getEmail().equals(login))
                p = i;
        }
        if (p != null && senha.equals(p.getSenha())){
            return p;
        }
        return null;
    }
}
