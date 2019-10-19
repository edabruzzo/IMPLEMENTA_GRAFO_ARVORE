/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementagrafo;

/**
 *
 * @author Internet
 */
public class Pilha {

    final int SIZE = 10;
    int[] pilha;
    int topo;

    public Pilha() {
        this.pilha = new int[SIZE];
        this.topo = -1;
    }

    public void insere(int n) {

        pilha[++topo] = n;
    }

    public int remove() {

        return pilha[topo--];

    }

    public int verTopo() {

        return pilha[topo];

    }

    public boolean vazia() {

        return topo == -1;

    }

    public int[] getPilha() {
        return pilha;
    }

    public void setPilha(int[] pilha) {
        this.pilha = pilha;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

}
