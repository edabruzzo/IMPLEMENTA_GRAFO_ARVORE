/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementagrafo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Internet
 */
public class Vertice {
    
    private String nome;
    private boolean visitado;
    List<Aresta> adjacencia;
    
    
    
    
    
    

    public Vertice(String nome, boolean visitado) {
        this.nome = nome;
        this.visitado = visitado;
        adjacencia = new ArrayList<Aresta>();
        
    }

    Vertice(String nome) {
     
    this.nome = nome;
    
    }


    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    
    
    
    
    
    public Vertice() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
    
    
    
}
