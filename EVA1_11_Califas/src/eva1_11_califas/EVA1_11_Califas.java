/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_califas;

/**
 *
 * @author 52614
 */
public class EVA1_11_Califas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String resu;
        resu = calificar(95);
        System.out.println(resu);
    }

    public static String calificar(int Cal) {
        String resu = "";
        if (Cal > 90 && Cal <= 100) {
            resu = "A";
        } else if (Cal > 80 && Cal < 91) {
            resu = "B";
        } else if (Cal > 70 && Cal < 81) {
            resu = "C";
        } else if (Cal > 70) {
            resu = "D";
        }
        return resu;

    }
}
