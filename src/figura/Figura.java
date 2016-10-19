/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author arser
 */
public class Figura {
    
    public Figura(String ptipo, String pcolor){
        this.setId(prefijo + ++cantFig);
        this.setColor(pcolor);
        this.setTipo(ptipo);
    }
    

    /**
     * @return the cantFig
     */
    public static int getCantFig() {
        return cantFig;
    }

    /**
     * @param aCantFig the cantFig to set
     */
    private static void setCantFig(int aCantFig) {
        cantFig = aCantFig;
    }
    private String id;
    private static int cantFig;
    private String tipo;
    private String color;
    private static String prefijo = "FIG-";

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    private void setId(String id) {
        this.id = id;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    public double calcularArea(){
        return 0;
    }
    
    public double calcularPerimetro(){
        return 0;
    }
    
    public String toString(){
        String resul = "";
        resul += "ID: " + this.getId() + "\n";
        resul += "Tipo: " + this.getTipo() + "\n";
        resul += "Color: " + this.getColor();
        return resul;
    }
}
