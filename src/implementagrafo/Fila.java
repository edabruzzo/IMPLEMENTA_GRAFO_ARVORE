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
public class Fila {

    final int SIZE = 10;
    private int[] fila;
    private int primeiro, ultimo;

    public Fila() {
        this.fila = new int[SIZE];
        this.primeiro = 0;
        this.ultimo = -1;
    }


    
    
    
    
    public void insere(int n) {

        if (ultimo != SIZE - 1) {
            fila[++ultimo] = n;
        }
    }
    
    
    
    public int remove(){
        
        int temp;
        if(!vazia()){
            
            temp = primeiro++;
            return temp;
        }
        
        return -1;
        
    }
    
    
    
    
    public int frente(){
        
        return fila[primeiro];
        
    }
    
    
    
    public boolean vazia(){
        
        return(primeiro > ultimo);
    }
    
    
    
    
    
    

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    public int[] getFila() {
        return fila;
    }

    public void setFila(int[] fila) {
        this.fila = fila;
    }

    public int getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(int primeiro) {
        this.primeiro = primeiro;
    }

}
