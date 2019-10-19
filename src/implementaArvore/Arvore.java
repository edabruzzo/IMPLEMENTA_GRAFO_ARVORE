/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaArvore;

import java.util.ArrayList;

/**
 *
 * @author Internet
 */
public class Arvore {

    private VerticeArvore atual, raiz = null;

    public void inserir(int n) {

        VerticeArvore vertice = new VerticeArvore();
        vertice.setValorRaiz(n);

        if (raiz == null) {

            raiz = vertice;

        } else {

            atual = raiz;

            //QUAL CONDIÇÃO ESTÁ SENDO VERIFICADA 
            while (true) {

                if (vertice.getValorRaiz() >= atual.getValorRaiz()) {

                    if (atual.getDireita() == null) {

                        atual.setDireita(vertice);
                        break;

                    } else {

                        atual = atual.getDireita();

                    }

                }

                if (vertice.getValorRaiz() < atual.getValorRaiz()) {

                    if (atual.getEsquerda() == null) {

                        atual.setEsquerda(vertice);
                        break;

                    } else {

                        atual = atual.getEsquerda();

                    }

                }

            }

        }

    }
    
    
    
        int numeroVertices = 0;    
    
    public int contaVerticesArvore(VerticeArvore vertice){
        
        

        
        
        if (vertice != null) {
            
            numeroVertices++;
            this.contaVerticesArvore(vertice.getEsquerda());
            this.contaVerticesArvore(vertice.getDireita());

        }

        
        return numeroVertices;
        
        
    }
    
    
    
    
    
    
    
    
    
    


    public VerticeArvore getAtual() {
        return atual;
    }

    public void setAtual(VerticeArvore atual) {
        this.atual = atual;
    }

    public VerticeArvore getRaiz() {
        return raiz;
    }

    public void setRaiz(VerticeArvore raiz) {
        this.raiz = raiz;
    }

    
    
    
    ArrayList<Integer> listaValoresOrdenados = new ArrayList<Integer>();
    
    
    public void preOrdem(VerticeArvore p) {

        
        if (p != null) {
            System.out.println(p.getValorRaiz() + "\n");
            this.listaValoresOrdenados.add(p.getValorRaiz());
            preOrdem(p.getEsquerda());
            preOrdem(p.getDireita());

        }

       
        
    }

    public void posOrdem(VerticeArvore p) {

        if (p != null) {

            posOrdem(p.getEsquerda());
            posOrdem(p.getDireita());
            System.out.println(p.getValorRaiz() + "\n");
            this.listaValoresOrdenados.add(p.getValorRaiz());

        }

    }
    
    
    
    
        public void pCentral(VerticeArvore p) {

        if (p != null) {

            pCentral(p.getEsquerda());
            System.out.println(p.getValorRaiz() + "\n");
            this.listaValoresOrdenados.add(p.getValorRaiz());
            pCentral(p.getDireita());

        }
        

    }

    
        public void imprimeValoresOrdenados(){
            
            
            for(Integer valor : listaValoresOrdenados){
                
                
                System.out.print(valor.toString() + " - ");
                
                
            }
            
        listaValoresOrdenados.clear();
            
        }
    
    

}
