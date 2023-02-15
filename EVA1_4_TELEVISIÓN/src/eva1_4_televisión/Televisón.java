/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_4_televisión;

/**
 *
 * @author 52614
 */
public class Televisón {

    private boolean power;
    private int volumen;
    private int canal;

    //Métodos: Comportamientos.
    //Constructor:
    public Televisón() {  //Constructor default.
        power = false; //Tv apagada
        volumen = 0;
        canal = 2;
    }

    //La regla para el nombre de los métodos debe ser un verbo.
    public void cambiarPower() {
        if (power == false) { //apagado
            power = true;
            System.out.println("TELEVISION ENCENDIDA");
        } else {
            power = false;
            System.out.println("TELEVISION APAGADA");
        }
    }

    public void subirVolumen() {
        if (power == true) {
            if (volumen < 100) {
                volumen = volumen + 5;
                System.out.println("______________________");
                System.out.println("Volumen: " + volumen);
            }
        }
    }

    public void bajarVolumen() {
        if (power == true) {
            if (volumen > 0) {
                volumen = volumen - 5;
                System.out.println("______________________");
                System.out.println("Volumen: " + volumen);
            }
        }
    }

    public void subirCanal() {
        if (power == true) {
            if (canal < 100) {
                canal = canal + 1;
            } else {
                canal = 0;
            }

            System.out.println("______________________");
            System.out.println("Canal: " + canal);
        }
    }

    public void bajarCanal() {
        if (power == true) {
            if (canal > 0) {
                canal = canal - 1;
            } else {
                canal = 100;
            }

            System.out.println("______________________");
            System.out.println("Canal: " + canal);
        }
    }

}
