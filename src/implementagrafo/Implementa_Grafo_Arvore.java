/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementagrafo;

import implementaArvore.Arvore;

/**
 *
 * @author Internet
 */
public class Implementa_Grafo_Arvore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //ImplementaGrafo.criaGrafo();
        Implementa_Grafo_Arvore.criaArvore_Ex1();
        //Implementa_Grafo_Arvore.criaArvore_Ex2();

    }

    public static void criaArvore_Ex1() {

        //23, 12, 10, 4, 25, 28, 24, 31, 42, 35
        Arvore arvore = new Arvore();
        arvore.inserir(12);
        arvore.inserir(23);
        arvore.inserir(10);
        arvore.inserir(34);
        arvore.inserir(45);
        arvore.inserir(8);
        arvore.inserir(9);
        arvore.inserir(25);
        arvore.inserir(32);
        
        System.out.println("IMPRIMINDO A ÁRVORE EM PRÉ-ORDEM ...\n");
        System.out.println("---------------------------------------------\n");
        arvore.preOrdem(arvore.getRaiz());
        System.out.println("---------------------------------------------\n");
        System.out.println("IMPRIMINDO VALORES ARMAZENADOS NO ARRAYLIST ORDENADOS EM PRÉ-ORDEM ...\n");
        arvore.imprimeValoresOrdenados();
        

        System.out.println("IMPRIMINDO A ÁRVORE EM ORDEM CENTRAL ...\n");
        System.out.println("---------------------------------------------\n");
        arvore.pCentral(arvore.getRaiz());
        System.out.println("---------------------------------------------\n");
        System.out.println("IMPRIMINDO VALORES ARMAZENADOS NO ARRAYLIST ORDENADOS EM ORDEM CENTRAL ...\n");
        arvore.imprimeValoresOrdenados();
        



        System.out.println("IMPRIMINDO A ÁRVORE EM PÓS-ORDEM ...\n");
        System.out.println("---------------------------------------------\n");
        arvore.posOrdem(arvore.getRaiz());
        System.out.println("---------------------------------------------\n");
        System.out.println("IMPRIMINDO VALORES ARMAZENADOS NO ARRAYLIST ORDENADOS EM PÓS-ORDEM ...\n");
        arvore.imprimeValoresOrdenados();
       
        
        System.out.println("A ÁRVORE POSSUI "+arvore.contaVerticesArvore(arvore.getRaiz())+" VÉRTICES.");
        
        
    }

    
    
    public static void criaGrafo() {

        // TODO code application logic here
        System.out.println("------------------------------\n");
        System.out.println("EXERCÍCIO A: \n");

        Grafo g = new Grafo();
        g.adVertice("A");//0
        g.adVertice("B");//1
        g.adVertice("C");//2   
        g.adVertice("D");//3   
        g.adVertice("E");//4   

        g.adAresta(0, 1);
        g.adAresta(1, 2);
        g.adAresta(1, 4);
        g.adAresta(1, 3);
        g.adAresta(2, 4);
        g.adAresta(4, 3);

        System.out.println("Busca em profundidade: \n");
        g.profundidade();
        System.out.println("------------------------------\n");
        System.out.println("Busca em largura: \n");
        g.largura();
        System.out.println("------------------------------\n");

        System.out.println("EXERCÍCIO B: \n");
        System.out.println("------------------------------\n");

        Grafo gB = new Grafo();
        gB.adVertice("A");//0
        gB.adVertice("B");//1
        gB.adVertice("C");//2   
        gB.adVertice("D");//3   
        gB.adVertice("E");//4   

        gB.adAresta(0, 1);
        gB.adAresta(0, 2);
        gB.adAresta(1, 3);
        gB.adAresta(1, 4);
        gB.adAresta(2, 4);

        System.out.println("Busca em profundidade: \n");
        gB.profundidade();
        System.out.println("------------------------------\n");
        System.out.println("Busca em largura: \n");
        gB.largura();
        System.out.println("------------------------------\n");

        System.out.println("EXERCÍCIO C: \n");
        System.out.println("------------------------------\n");

        Grafo gC = new Grafo();
        gC.adVertice("A");//0
        gC.adVertice("B");//1
        gC.adVertice("C");//2   
        gC.adVertice("D");//3   

        gC.adAresta(0, 1);
        gC.adAresta(0, 3);
        gC.adAresta(1, 3);
        gC.adAresta(1, 2);
        gC.adAresta(2, 3);

        System.out.println("Busca em profundidade: \n");
        gC.profundidade();
        System.out.println("------------------------------\n");
        System.out.println("Busca em largura: \n");
        gC.largura();
        System.out.println("------------------------------\n");

    }







    public static void criaGrafoValorado_Exercicio13() {

        // TODO code application logic here
        System.out.println("------------------------------\n");
        System.out.println("EXERCÍCIO 13: \n");

        Grafo g = new Grafo();
        Vertice A = g.adicionaVertice("A");
        Vertice B = g.adicionaVertice("B");
        Vertice C = g.adicionaVertice("C");
        Vertice D = g.adicionaVertice("D");
        Vertice E = g.adicionaVertice("E");
        
        
        Aresta AC = g.adicionaAresta(A, C, 150);
        Aresta BC = g.adicionaAresta(B, C, 57);
        Aresta CD = g.adicionaAresta(C, D, 68);
        Aresta BE = g.adicionaAresta(B, E, 49);
        Aresta DE = g.adicionaAresta(D, E, 95);









}
