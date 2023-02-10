/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_clases_java;

/**
 *
 * @author 52614
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Prototipo para diseñar una clase. 
//Creación de una clase persona.
//Crear un objeto.
//Instanciación --> Dar memoria RAM.
//Nombre de la clase identificador = new constructor de la clase();

        Persona perso1 = new Persona(); //Persona() es el constructor (siempre se llama igual que la clase)

        /* perso1.nombre = "Diana";
perso1.apellidos = "Rosales";

        System.out.println(perso1.nombre + " " + perso1.apellidos);*/
        perso1.setNombre("Diana");
        perso1.setApellidos("Rosales Capistran"); // " Comillas dobles para cadena"
        perso1.setEdad(19);
        perso1.setGenero('M'); //'Comillas simples para caracter'

        /*System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellidos());
        System.out.println(perso1.getEdad());
        System.out.println(perso1.getGenero());*/
        perso1.ImprimirDatos();
        
        //-----             //Constructor
        Persona perso2 = new Persona ();
        perso2.setNombre("Armando");
        perso2.setApellidos("Gomez");
        perso2.setEdad(29);
        perso2.setGenero('H');
        perso2.ImprimirDatos();
    }

}
