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
public class Puerta {
    private String materialPuerta;
    private String colorPuerta;
    private float largoPuerta;
    private float anchoPuerta;

    public Puerta() {
    }

    public Puerta(String materialPuerta, String colorPuerta, float largoPuerta, float anchoPuerta) {
        this.materialPuerta = materialPuerta;
        this.colorPuerta = colorPuerta;
        this.largoPuerta = largoPuerta;
        this.anchoPuerta = anchoPuerta;
    }

    public float getAnchoPuerta() {
        return anchoPuerta;
    }

    public void setAnchoPuerta(float anchoPuerta) {
        this.anchoPuerta = anchoPuerta;
    }

    public String getMaterialPuerta() {
        return materialPuerta;
    }

    public void setMaterialPuerta(String materialPuerta) {
        this.materialPuerta = materialPuerta;
    }

    public String getColorPuerta() {
        return colorPuerta;
    }

    public void setColorPuerta(String colorPuerta) {
        this.colorPuerta = colorPuerta;
    }

    public float getLargoPuerta() {
        return largoPuerta;
    }

    public void setLargoPuerta(float largoPuerta) {
        this.largoPuerta = largoPuerta;
    }
    
    public void abrirPuerta (){
        System.out.println("La puerta ha sido abierta");
    }
    
    public void cerrarPuerta (){
        System.out.println("La puerta ha sido cerrada");
    }
   
}
