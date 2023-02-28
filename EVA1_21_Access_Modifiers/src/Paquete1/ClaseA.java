/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author 52614
 */
public class ClaseA {

    public int publicA;
    int defaultA;
    private int privateA;

    public void prueba() {
        /*
        Todas estas clases están en el paquete1
        Mismo paquete, public y default son
        visibles
         */

        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;

        ClaseC objC = new ClaseC();
        //objC.publicC;
        //objC.defaultC;

        ClaseD objD = new ClaseD();
        //objD.publicD;
        //objD.defaultD

        /* Clases del paquete2
        Todo lo que sea default es ahora 
        invisible
         */
        ClaseE objE = new ClaseE();
        //objE.publicE;

        /* Clase F --> Es default 
        Y no es visible en otro paquete.
         */
        //ClaseF objF = new ClaseF();
    }
}

class ClaseB {

    public int publicB;
    int defaultB;
    private int privateB;
}
