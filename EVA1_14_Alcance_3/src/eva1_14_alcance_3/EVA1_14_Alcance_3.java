/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_alcance_3;

/**
 *
 * @author 52614
 */
public class EVA1_14_Alcance_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j = 100;
        System.out.println(j); //Visible en todo el main
        for (int i = 0; i < 10; i++) {
            //int j = 100; //No se puede porque ya existe en el main
            System.out.println(j); //Visible en todo el main
            System.out.println(i);
            if (i == 5) {
                System.out.println(j); //Visible en todo el main
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }

    public static void Algo(int x) {

    }

    public static void Algo2(int x) {

    }
}
