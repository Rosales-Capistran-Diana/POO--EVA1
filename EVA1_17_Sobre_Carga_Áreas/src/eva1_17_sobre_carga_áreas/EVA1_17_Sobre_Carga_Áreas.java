/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_sobre_carga_áreas;

/**
 *
 * @author 52614
 */
public class EVA1_17_Sobre_Carga_Áreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("El area del circulo es : " + CalcularArea(5));
        System.out.println("El area del triangulo es : " + CalcularArea(5, 5));
        System.out.println("El area del trapecio es : " + CalcularArea(5, 5, 5));
    }

    public static double CalcularArea(double r) {

        return Math.PI * (r * r);
    }

    public static double CalcularArea(double a, double b) {
        return (a * b) / 2;

    }

    public static double CalcularArea(double may, double men, double a) {
        return (a * may * men) / 2;
    }
}
