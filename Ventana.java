/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.artículos;

/**
 *
 * @author JOBV 
 */
public class Ventana {
    private float largoVentana;
    private float anchoVentana;
    private boolean mosquitero;
    private boolean cortina;

    public Ventana() {
    }

    public Ventana(float largoVentana, float anchoVentana, boolean mosquitero, boolean cortina) {
        this.largoVentana = largoVentana;
        this.anchoVentana = anchoVentana;
        this.mosquitero = mosquitero;
        this.cortina = cortina;
    }

    public boolean isCortina() {
        return cortina;
    }

    public void setCortina(boolean cortina) {
        this.cortina = cortina;
    }

    public float getLargoVentana() {
        return largoVentana;
    }

    public void setLargoVentana(float largoVentana) {
        this.largoVentana = largoVentana;
    }

    public float getAnchoVentana() {
        return anchoVentana;
    }

    public void setAnchoVentana(float anchoVentana) {
        this.anchoVentana = anchoVentana;
    }

    public boolean isMosquitero() {
        return mosquitero;
    }

    public void setMosquitero(boolean mosquitero) {
        this.mosquitero = mosquitero;
    }
    
    public void abrirVentana() {
        System.out.println("Abriendo la ventana");
    }
    public void cerrarVentana(){
        System.out.println("Cerrando la ventana");
    }
}
