/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

import Paquete1.ClaseA;

/**
 *
 * @author 52614
 */
public class ClaseE {

    public int publicE;
    int defaultE;
    private int privateE;

}

class F {

    public int publicF;
    int defaultF;
    private int privateF;

    public void prueba() {
        ClaseA objA = new ClaseA();
        //objA.publicA;
        objA.prueba();

        /* --> Clase D es fedault, en otro paquete es invisible
       ClaseD objD = new ClaseD();
        
         */
    }
}
