/*

https://malbarbo.pro.br/arquivos/2012/1747/Grafo.java





 */
package implementagrafo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Internet
 */
public class Grafo {

    final int MAX = 10;
    private int nVertices;
    private int matAdj[][];
    private Vertice listaVertice[];
    private Pilha pilha;
    private Fila fila;
    List<Aresta> arestas;
    List<Vertice> vertices;

    public Grafo() {
        this.nVertices = 0;
        this.matAdj = new int[MAX][MAX];
        this.listaVertice = new Vertice[MAX];
        vertices = new ArrayList<Vertice>();
        arestas = new ArrayList<Aresta>();

        for (int i = 0; i < matAdj.length; i++) {
            for (int j = 0; j < matAdj.length; j++) {

                matAdj[i][j] = 0;

            }

            this.pilha = new Pilha();
            this.fila = new Fila();

        }

    }

    public Vertice adicionaVertice(String nome) {
        Vertice v = new Vertice(nome);
        vertices.add(v);
        return v;
    }

    public Aresta adicionaAresta(Vertice origem, Vertice destino, int valor) {
        Aresta e = new Aresta(origem, destino, valor);
        origem.adjacencia.add(e);
        arestas.add(e);
        return e;
    }

    public void adVertice(String nome) {

        listaVertice[nVertices++] = new Vertice(nome);

    }

    public void adAresta(int inicio, int fim) {

        matAdj[inicio][fim] = 1;

    }

    public void exibeVertice(int v) {

        System.out.println(listaVertice[v].getNome() + "");

    }

    public int verticeAdjNaoVisitado(int v) {

        for (int j = 0; j < nVertices; j++) {

            if (this.matAdj[v][j] == 1 && !listaVertice[j].isVisitado()) {

                return j;

            }

        }

        return -1;

    }

    public void profundidade() {

        listaVertice[0].setVisitado(true);
        this.exibeVertice(0);
        pilha.insere(0);

        while (!pilha.vazia()) {

            int v = verticeAdjNaoVisitado(pilha.verTopo());
            if (v == -1) {
                pilha.remove();
            } else {

                listaVertice[v].setVisitado(true);
                this.exibeVertice(v);
                pilha.insere(v);

            }

        }

        this.reiniciar();
    }

    public Fila getFila() {
        return fila;
    }

    public void setFila(Fila fila) {
        this.fila = fila;
    }

    public int getnVertices() {
        return nVertices;
    }

    public void setnVertices(int nVertices) {
        this.nVertices = nVertices;
    }

    public int[][] getMatAdj() {
        return matAdj;
    }

    public void setMatAdj(int[][] matAdj) {
        this.matAdj = matAdj;
    }

    public Vertice[] getListaVertice() {
        return listaVertice;
    }

    public void setListaVertice(Vertice[] listaVertice) {
        this.listaVertice = listaVertice;
    }

    public Pilha getPilha() {
        return pilha;
    }

    public void setPilha(Pilha pilha) {
        this.pilha = pilha;
    }

    public void largura() {

        this.listaVertice[0].setVisitado(true);
        this.exibeVertice(0);
        this.fila.insere(0);

        int v;
        int atual;

        while (!this.fila.vazia()) {

            atual = fila.remove();
            while ((v = this.verticeAdjNaoVisitado(atual)) != -1) {

                listaVertice[v].setVisitado(true);
                this.exibeVertice(v);
                this.fila.insere(v);

            }

        }

        reiniciar();

    }

    public void reiniciar() {

        for (int j = 0; j < nVertices; j++) {

            listaVertice[j].setVisitado(false);

        }

    }

    public void exibeMatrizIncidencia() {

        System.out.println("Imprimindo a matriz de incidência para o grafo valorado\n");

        for (Vertice v : this.getListaVertice()) {
            for (Aresta aresta : v.adjacencia) {
                if (aresta.getValor() > 0) {

                    System.out.println(aresta.getOrigem() + " - "
                            + "" + aresta.getDestino() + " - peso: " + aresta.getValor());

                }
            }
        }

    }

}
