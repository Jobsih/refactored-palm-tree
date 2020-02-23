/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.inmueble;

import ico.fes.poo.artículos.Habitacion;
import ico.fes.poo.artículos.Puerta;
import ico.fes.poo.artículos.Ventana;

/**
 *
 * @author JOBV
 */
public class Casa {
    private float terreno;
    private int cantidadPisos;
    private String colorFachada;
    private Puerta puertaDelantera;
    private Puerta puertaTrasera;
    private Ventana ventanaSala;
    private Ventana ventanaCuarto1;
    private Habitacion sala;
    private Habitacion cuarto1;
    private Habitacion cuarto2;

    public Casa() {
    }

    public Casa(float terreno, int cantidadPisos, String colorFachada, Puerta puertaDelantera, Puerta puertaTrasera, Ventana ventanaSala, Ventana ventanaCuarto1, Habitacion sala, Habitacion cuarto1, Habitacion cuarto2) {
        this.terreno = terreno;
        this.cantidadPisos = cantidadPisos;
        this.colorFachada = colorFachada;
        this.puertaDelantera = puertaDelantera;
        this.puertaTrasera = puertaTrasera;
        this.ventanaSala = ventanaSala;
        this.ventanaCuarto1 = ventanaCuarto1;
        this.sala = sala;
        this.cuarto1 = cuarto1;
        this.cuarto2 = cuarto2;
    }

    public Habitacion getCuarto2() {
        return cuarto2;
    }

    public void setCuarto2(Habitacion cuarto2) {
        this.cuarto2 = cuarto2;
    }

    public float getTerreno() {
        return terreno;
    }

    public void setTerreno(float terreno) {
        this.terreno = terreno;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public String getColorFachada() {
        return colorFachada;
    }

    public void setColorFachada(String colorFachada) {
        this.colorFachada = colorFachada;
    }

    public Puerta getPuertaDelantera() {
        return puertaDelantera;
    }

    public void setPuertaDelantera(Puerta puertaDelantera) {
        this.puertaDelantera = puertaDelantera;
    }

    public Puerta getPuertaTrasera() {
        return puertaTrasera;
    }

    public void setPuertaTrasera(Puerta puertaTrasera) {
        this.puertaTrasera = puertaTrasera;
    }

    public Ventana getVentanaSala() {
        return ventanaSala;
    }

    public void setVentanaSala(Ventana ventanaSala) {
        this.ventanaSala = ventanaSala;
    }

    public Ventana getVentanaCuarto1() {
        return ventanaCuarto1;
    }

    public void setVentanaCuarto1(Ventana ventanaCuarto1) {
        this.ventanaCuarto1 = ventanaCuarto1;
    }

    public Habitacion getSala() {
        return sala;
    }

    public void setSala(Habitacion sala) {
        this.sala = sala;
    }

    public Habitacion getCuarto1() {
        return cuarto1;
    }

    public void setCuarto1(Habitacion cuarto1) {
        this.cuarto1 = cuarto1;
    }
    
    
   
}
