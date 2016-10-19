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
public class Rectangulo extends Figura{
    private double base;
    private double altura;
    
    public Rectangulo(double paltura, double pbase, String pcolor){
        super("Rectangulo", pcolor);
        this.setAltura(paltura);
        this.setBase(pbase);
    }
    
    public Rectangulo(double paltura, double pbase){
        this(paltura, pbase, "");
    }
    
    public Rectangulo(){
        this(0,0,"");
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularArea(){
        double area = this.getAltura() * this.getBase();
        return area;
    }
    
    public double calcularPerimetro(){
        double perimetro = this.getAltura() * 2 + this.getBase() * 2;
        return perimetro;
    }
    
    public String toString(){
        String resul = "";
        resul += "Color: " + super.getColor() + "\n";
        resul += "ID: " + super.getId() + "\n";
        resul += "Tipo: " + super.getTipo() + "\n";
        resul += "Altura: " + this.getAltura() + "\n";
        resul += "Base: " + this.getBase() + "\n";
        return resul;
    }
}
