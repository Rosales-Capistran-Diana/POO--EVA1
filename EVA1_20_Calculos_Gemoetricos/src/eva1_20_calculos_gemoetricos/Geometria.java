/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_20_calculos_gemoetricos;

/**
 *
 * @author 52614
 */
public class Geometria {

    /*Final: 
    Un significado para las clases, 
    un significado para variables
    Solo se puede asignar una vez.
     */
    //constantes:
    public static final double PI = 3.1416;

    //Perímetro de un círculo
    public static double perímetroCirculo(double r) {
        return PI * (r * 2);
    }
    //Área:
    public static double areaCirculo(double r){
        return PI * (r * r);
    }
    //Volumen de una esfera:
    public static double volumenEsfera (double r){
        return (4.0 / 3.0) * (PI * (r * r * r));
    }
}
