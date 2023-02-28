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
public class ClaseC {

    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
         /*
        Todas estas clases están en el paquete1
        Mismo paquete, public y default son
        visibles
         */

        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;

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

class ClaseD {

    public int publicD;
    int defaultD;
    private int privateD;
}
