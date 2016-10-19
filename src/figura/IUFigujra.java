/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;
import java.io.*;
/**
 *
 * @author arser
 */
public class IUFigujra {

    /**
     * @param args the command line arguments
     */
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    public static void main(String[] args) throws java.io.IOException{
        out.println("Introduzca la base del rectangulo");
        double base = Leer.Double();
        out.println("Introduzca la altura del rectangulo");
        double altura = Leer.Double();
        Figura r1 = new Rectangulo(base, altura);
        out.println("Introduzca el radio del circulo");
        double radio = Leer.Double();
        Figura c1 = new Circulo(radio);
        out.println("Introduzca la base de un triangulo");
        base = Leer.Double();
        out.println("Introduzca la altura de un triangulo");
        altura = Leer.Double();
        Figura t1 = new Triangulo(base,altura);
        
        out.println("Area del rectangulo: " + r1.calcularArea());
        out.println("Perimetro del rectangulo: " + r1.calcularPerimetro());
        out.println();
        out.println("Area del circulo: " + c1.calcularArea());
        out.println("Perimetro del circulo: " + c1.calcularPerimetro());
        out.println();
        out.println("Area del triangulo: " + t1.calcularArea());
        out.println("Perimetro del triangulo: " + t1.calcularPerimetro());
        
    }
    
}
