/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vboni
 */
public class ListaMalo {

    private NodoMalo head;
    private int tamano;

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public NodoMalo getHead() {
        return this.head;
    }

    public void setHead(NodoMalo head) {
        this.head = head;
    }

    public void agregarAlFinal(Malo personaje) {

        NodoMalo nuevo = new NodoMalo();
        nuevo.setPersonaje(personaje);

        if (this.getHead() == null) {
            this.setHead(nuevo);
        } else {
            NodoMalo currentNode = this.getHead();
            while (currentNode.getSiguiente() != null) {
                currentNode = currentNode.getSiguiente();
            }
            currentNode.setSiguiente(nuevo);
        }
        tamano++;
    }

    public Malo retornar(int referencia) {
        NodoMalo aux = this.getHead();
        if (estaVacia()) {
            System.out.println("Lista vacia");
            return null;
        }

        if (referencia == 0) {
            return aux.getPersonaje();
        }
        for (int i = 0; i < tamano; i++) {
            if(i == referencia){
                return aux.getPersonaje();
            }
           aux = aux.getSiguiente(); 
           
        }
        
        
        return null;
    }

    public boolean estaVacia() {
        return tamano == 0;
    }

}
