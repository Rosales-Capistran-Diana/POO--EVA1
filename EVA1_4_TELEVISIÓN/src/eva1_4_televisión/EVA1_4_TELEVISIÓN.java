/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_televisión;

/**
 *
 * @author 52614
 */
public class EVA1_4_TELEVISIÓN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisón tv1 = new Televisón();
        tv1.cambiarPower();
        //ctrl + shift. Para duplicar instrucción.
        tv1.cambiarPower();
        tv1.cambiarPower();

        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.bajarVolumen();
        tv1.bajarVolumen();

        /*tv1.subirCanal();
        tv1.subirCanal();
        tv1.subirCanal();
        tv1.subirCanal();*/
        tv1.bajarCanal();
        tv1.bajarCanal();
        tv1.bajarCanal();
    }

}
