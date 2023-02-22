/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_return;

/**
 *
 * @author 52614
 */
public class EVA1_10_Return {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        square(10); //Llamada a función, pero sin procesar el resultado
        int resu;
        resu = square (3); //Llamada a función, almacenando el resultado.
        System.out.println(resu);
        System.out.println(square(5));//Llamadas a función, enviando el resultado 
    }

    public static int square(int n) {
        return n * n;
    }
}
