/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_sobre_carga_2;

/**
 *
 * @author 52614
 */
public class EVA1_16_Sobre_Carga_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("La suma es: " + suma(5, 6));
        System.out.println("La suma es: " + suma(2.5, 2.5));
        System.out.println("La suma es: " + suma("Hola ", "Mundo!  (: "));
        suma();
        
//¿Cómo distingue java cuál usar? En base a sus argumentos.
    }

    //SUMA DE DOS NÚMEROS ENTEROS.
//Firma del método --> suma(int,int)
    public static int suma(int n1, int n2) {
        return n1 + n2;
    }

//Firma del método --> suma(double,double)
    public static double suma(double n1, double n2) {
        return n1 + n2;
    }
//Firma del método --> suma(String,String)

    public static String suma(String n1, String n2) {
        return n1 + n2;
    }
 //Firma del método --> suma()
    public static void suma() {
        System.out.println("La suma es: Sin argumentos ");
    }
}
