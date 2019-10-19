/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementagrafo;

/**
 *
 * @author Emm
 */
public class Aresta {

private Vertice origem;
private Vertice destino;
private int valor;

    public Aresta(Vertice origem, Vertice destino, int valor) {
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
    }

    public Aresta() {
    }





public Vertice getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }




    
}
