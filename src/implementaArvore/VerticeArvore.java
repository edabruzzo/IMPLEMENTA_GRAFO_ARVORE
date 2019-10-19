/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaArvore;

/**
 *
 * @author Internet
 */
public class VerticeArvore {
    
    
    private VerticeArvore esquerda;
    private VerticeArvore direita;
    private int valorRaiz;

    
    public VerticeArvore() {
    
        esquerda = null;
        direita = null;
    
    }
            
            

    public VerticeArvore getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(VerticeArvore esquerda) {
        this.esquerda = esquerda;
    }

    public VerticeArvore getDireita() {
        return direita;
    }

    public void setDireita(VerticeArvore direita) {
        this.direita = direita;
    }

    public int getValorRaiz() {
        return valorRaiz;
    }

    public void setValorRaiz(int valorRaiz) {
        this.valorRaiz = valorRaiz;
    }

    
    
    
    
}
