/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dachapi
 */
public class listaRepetidas {
    private NodoBuenoMalo head;
    private int tamanno;

    public NodoBuenoMalo getHead() {
        return head;
    }

    public void setHead(NodoBuenoMalo head) {
        this.head = head;
    }

    public int getTamanno() {
        return tamanno;
    }

    public void setTamanno(int tamanno) {
        this.tamanno = tamanno;
    }
    
    //Metodo que verifica si la lista esta vacia
    public boolean isEmpty(){
        return this.getHead() == null;
    }
    
    //Metodo para insertar nodos
    public void insertNode(Malo d){
        
        NodoBuenoMalo nNode = new NodoBuenoMalo(d);
        
        if (isEmpty()) {
            System.out.println("Inicializando lista");
            
            nNode.setPrevio(nNode);
            nNode.setSiguiente(nNode);
            
            this.setHead(nNode);
            tamanno++;
            
            return;
        }
        
        NodoBuenoMalo tail = this.getHead().getPrevio();
        
        nNode.setSiguiente(this.getHead());
        
        this.getHead().setPrevio(nNode);
        
        tail.setSiguiente(nNode);
        
        nNode.setPrevio(tail);
        
        tamanno++;

    }
    
    public Malo retornar(int referencia) {
        
        NodoBuenoMalo aux = this.getHead();
        
        if (isEmpty()) {
            System.out.println("Lista vacia");
            return null;
        }

        if (referencia == 0) {
            return aux.getPersonaje();
        }
        for (int i = 0; i < tamanno; i++) {
            if(i == referencia){
                return aux.getPersonaje();
            }
           aux = aux.getSiguiente(); 
           
        }
        
        
        return null;
    }
    
    
    
}
