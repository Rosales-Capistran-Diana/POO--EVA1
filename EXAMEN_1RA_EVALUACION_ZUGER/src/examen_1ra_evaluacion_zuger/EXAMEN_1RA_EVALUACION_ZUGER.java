/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_1ra_evaluacion_zuger;

import CLASES_EXAMEN.CuentaBancaria;
import CLASES_EXAMEN.FIBONACCI;
import CLASES_EXAMEN.FichaBibliografica;
import CLASES_EXAMEN.INTEGRANTES;
import static CLASES_EXAMEN.INTEGRANTES.A;
import CLASES_EXAMEN.Pelicula;
import CLASES_EXAMEN.TestCovid;

/**
 *
 * @author 52614
 */
public class EXAMEN_1RA_EVALUACION_ZUGER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("___________________");
        INTEGRANTES.ImprimirDatosEquipo("Mario Ivan Mendez Alvarez #22550370");
        INTEGRANTES.ImprimirDatosEquipo("Diana Rebeca Rosales Capistran #22550310");
        INTEGRANTES.ImprimirDatosEquipo("Eduardo Esteban Rascón Almeida #22550305");
        INTEGRANTES.ImprimirDatosEquipo("Ivan Ramirez Noroña #22550352");
        
        System.out.println("___________________");
        
        INTEGRANTES.verificarAcceso();
        
        System.out.println("___________________");
        Pelicula peli = new Pelicula();
        // peli.imprimirdatos();
        peli.imprimirdatos();
        System.out.println(peli.getestudio());
        System.out.println(peli.getrating());
        System.out.println(peli.gettitulo());
        
        System.out.println("___________________");
        
        A();
        System.out.println("___________________");
        
        INTEGRANTES.ImprimirDatosCuenta();
        
        System.out.println("___________________");
        
        INTEGRANTES.ImprimirProblemasResueltos();
        System.out.println("___________________");

    }

}
