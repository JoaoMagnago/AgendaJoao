/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import modelo.Bairro;
import modelo.Cidade;

/**
 *
 * @author Isao Felipe Morigaki
 */
public class CidadeDAO {
    public static List<Cidade> cidades = new ArrayList<>();
    
    public List<Cidade> getCidades(){
        cidades = new ArrayList<>();
        List<Bairro> b1 = new ArrayList<>();
        b1.add(new Bairro(1, "Centro"));
        b1.add(new Bairro(2, "Jardim Camburi"));
        b1.add(new Bairro(3, "Jardim da Penha"));
        cidades.add(new Cidade(1, "Vitoria", b1));
        
        List<Bairro> b2 = new ArrayList<>();
        b2.add(new Bairro(4, "Santa Ines"));
        b2.add(new Bairro(5, "Coqueiral"));
        b2.add(new Bairro(6, "Praia da Costa"));
        cidades.add(new Cidade(2, "Vila Velha", b2));
        
        return cidades;
    }
    
    public Cidade Buscar(int id){
        for (Cidade c : cidades){
            if(c.getId() == id)
                return c;
        }
        return null;
    }
}
