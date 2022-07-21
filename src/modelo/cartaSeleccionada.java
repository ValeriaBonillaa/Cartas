/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dachapi
 */
public class cartaSeleccionada {
    private String n_Personaje;
    private String dispocicion;
    private String oficio;
    private String especie;
    private String arma;
    private String rareza;
    private int usuario;

    public cartaSeleccionada() {
    }

    
    public cartaSeleccionada(String n_Personaje, String dispocicion, String oficio, String especie, String arma, String rareza, int usuario) {
        this.n_Personaje = n_Personaje;
        this.dispocicion = dispocicion;
        this.oficio = oficio;
        this.especie = especie;
        this.arma = arma;
        this.rareza = rareza;
        this.usuario = usuario;
    }

    public String getN_Personaje() {
        return n_Personaje;
    }

    public void setN_Personaje(String n_Personaje) {
        this.n_Personaje = n_Personaje;
    }

    public String getDispocicion() {
        return dispocicion;
    }

    public void setDispocicion(String dispocicion) {
        this.dispocicion = dispocicion;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "cartaSeleccionada{" + "n_Personaje=" + n_Personaje + ", dispocicion=" + dispocicion + ", oficio=" + oficio + ", especie=" + especie + ", arma=" + arma + ", rareza=" + rareza + ", usuario=" + usuario + '}';
    }
    
    
    
}
