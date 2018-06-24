/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.HashMap;
import modelo.Pessoa;

/**
 *
 * @author alunodev06
 */
class IDToolsBDUsuario {
    public static HashMap<String, Integer> pessoasCadastradas = new HashMap<>();
    public IDToolsBDUsuario(){
//        pessoasCadastradas.put("Isao", new Integer(123));
//        pessoasCadastradas.put("Joao", new Integer(111));
//        pessoasCadastradas.put("Mateus", new Integer(222));
    }
    
    public void cadastrar(Pessoa p){
        pessoasCadastradas.put(p.nome, p.senha);
    }
    
    public Pessoa verificar(LoginMB p){
        if (p.senha.equals(pessoasCadastradas.get(p.login))){
            return new Pessoa(p);
        }
        return null;
    }
}
