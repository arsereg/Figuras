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
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double pradio, String pcolor){
        super("Circulo", pcolor);
        this.setRadio(pradio);
    }
    
    public Circulo(double pradio){
        this(pradio, "");
    }
    
    public Circulo(){
        this(0,"");
    }
    
    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    
    public double calcularCircunferencia(){
        double circunferencia = 2 * Math.PI * this.getRadio();
        return circunferencia;
    }
    
    public double calcularPerimetro(){
        double resul = calcularCircunferencia();
        return resul;
    }
    
    public String toString(){
        String resul = "";
        resul += "ID: " + super.getId() + "\n";
        resul += "Tipo: " + super.getTipo() + "\n";
        resul += "Color: " + super.getColor() + "\n";
        resul += "Radio: " + this.getRadio() + "\n";
        return resul;
    }
}
