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
public class Triangulo extends Figura{
    private double base;
    private double altura;
    
    public Triangulo(double paltura, double pbase, String pcolor){
        super("Triangulo", pcolor);
        this.setAltura(paltura);
        this.setBase(pbase);
    }
    
    public Triangulo(double paltura, double pbase){
        this(paltura, pbase, "");
    }
    
    public Triangulo(){
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
        double area = (this.getBase() + this.getAltura()) / 2;
        return area;
    }
    
    public double calcularPerimetro(){
        double catetoCuadrado = Math.pow(altura, 2);
        double hipotenusaCuadrada = Math.pow(base, 2);
        double catetoPorDescubrir = hipotenusaCuadrada - catetoCuadrado;
        double catetoDescubierto = Math.sqrt(catetoPorDescubrir);
        double perimetro = base + altura + catetoDescubierto;
        return perimetro;
    }
}
