/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.artículos;

/**
 *
 * @author jorge
 */
public class Habitacion {
    private float anchoHabitacion;
    private float largoHabitacion;
    private float alturaHabitacion;
    private int numeroMuebles;
    private String colorPared;
    private String materialSuelo;

    public Habitacion() {
    }

    public Habitacion(float anchoHabitacion, float largoHabitacion, float alturaHabitacion, int numeroMuebles, String colorPared, String materialSuelo) {
        this.anchoHabitacion = anchoHabitacion;
        this.largoHabitacion = largoHabitacion;
        this.alturaHabitacion = alturaHabitacion;
        this.numeroMuebles = numeroMuebles;
        this.colorPared = colorPared;
        this.materialSuelo = materialSuelo;
    }

    public String getMaterialSuelo() {
        return materialSuelo;
    }

    public void setMaterialSuelo(String materialSuelo) {
        this.materialSuelo = materialSuelo;
    }

    public float getAnchoHabitacion() {
        return anchoHabitacion;
    }

    public void setAnchoHabitacion(float anchoHabitacion) {
        this.anchoHabitacion = anchoHabitacion;
    }

    public float getLargoHabitacion() {
        return largoHabitacion;
    }

    public void setLargoHabitacion(float largoHabitacion) {
        this.largoHabitacion = largoHabitacion;
    }

    public float getAlturaHabitacion() {
        return alturaHabitacion;
    }

    public void setAlturaHabitacion(float alturaHabitacion) {
        this.alturaHabitacion = alturaHabitacion;
    }

    public int getNumeroMuebles() {
        return numeroMuebles;
    }

    public void setNumeroMuebles(int numeroMuebles) {
        this.numeroMuebles = numeroMuebles;
    }

    public String getColorPared() {
        return colorPared;
    }

    public void setColorPared(String colorPared) {
        this.colorPared = colorPared;
    }
    
    public void contenerPersonas (int x){
        System.out.println("La habitacion tiene"+ x + "personas dentro");
    }
}
