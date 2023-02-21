/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_llamada_función;

/**
 *
 * @author 52614
 */
public class EVA1_8_Llamada_Función {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("INICIA main()");
        A();
        System.out.println("TERMINA main()");
    }

    public static void A() {
        System.out.println("INICIA A()");
        B();
        System.out.println("TERMINA A()");
    }

    public static void B() {
        System.out.println("INICIA B()");

        System.out.println("TERMINA B()");
    }
}
