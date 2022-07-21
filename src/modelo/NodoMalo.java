/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vboni
 */
public class NodoMalo {

    private Malo personaje;
    private NodoMalo siguiente;

    public NodoMalo(Malo personaje, NodoMalo siguiente) {
        this.personaje = personaje;
        this.siguiente = siguiente;
    }

    NodoMalo() {
    }

    public Malo getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Malo personaje) {
        this.personaje = personaje;
    }

    public NodoMalo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoMalo siguiente) {
        this.siguiente = siguiente;
    }
}
