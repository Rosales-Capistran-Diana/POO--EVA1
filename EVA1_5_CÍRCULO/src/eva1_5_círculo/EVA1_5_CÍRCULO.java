/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_círculo;

/**
 *
 * @author 52614
 */
public class EVA1_5_CÍRCULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Círculo cir1 = new Círculo();
        System.out.println("Area: " + cir1.getArea() + " " + "Diametro: " + cir1.getDiametro() + " " + "Perimetro: " + cir1.getPerimetro() + " " + "Radio: " + cir1.getRadio());
    cir1.setRadio(10);
        System.out.println("Area: " + cir1.getArea() + " Perímetro: " + cir1.getPerimetro() + " Diametro: " + cir1.getDiametro() + " Radio: " + cir1.getRadio());
    
    }
    
}
