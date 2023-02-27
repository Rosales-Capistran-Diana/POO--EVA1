/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_static;

/**
 *
 * @author 52614
 */
public class EVA1_18_Static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prueba obj = new Prueba();
        obj.mensaje();
        Prueba.mensajeEstatico();
        
        /*Static
        Al iniciar su programa
        Se crea todo lo estático.
         */
      

        System.out.println("PI " + Math.PI);

    }

}

class Prueba {

    public void mensaje() { //Solo al crear objetos se puede utilizar.
        System.out.println("Holaa!");
    }

    public static void mensajeEstatico() { //Se puede utilizar directamente de la clase.
        System.out.println("Holaa (estatico)!!!");
    }
}

class Otra {

}
