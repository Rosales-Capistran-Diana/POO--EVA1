/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_5_círculo;

/**
 *
 * @author 52614
 */
public class Círculo {

    private double area;
    private double perimetro;
    private double radio;
    private double diametro;

    public Círculo() {  //Constructor default
        radio = 5;
        area = 0;
        perimetro = 0;
        diametro = 0;
    }

    public Círculo(double r, double a1, double suma) {
        r = radio;
        a1 = area;
        suma = perimetro;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double valor) {
        radio = valor;
    }

    public double getArea() {
        double area = Math.PI * (radio * radio);
        return area;
        // Math.pow es para elevar a potencia.
    }
    public double getPerimetro() {
        double perimetro = Math.PI * (2 * radio);
        return perimetro;
    }
    public double getDiametro() {
        return radio * 2;
    }
}
