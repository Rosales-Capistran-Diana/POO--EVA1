/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_automovil;

/**
 *
 * @author 52614
 */
public class EVA1_6_Automovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro c1 = new Carro(); //Carro() es el constructor (siempre se llama igual que la clase)
        /*System.out.println("Datos del cliente: ");
        System.out.println(c1.getAño());
        System.out.println(c1.getMarca());
        System.out.println(c1.getModelo());
        System.out.println(c1.getPlacas());
        System.out.println(c1.getAdeudo()); */

        System.out.println("DATOS DEL CLIENTE: ");
        c1.setAño(2000);
        c1.setMarca("Chevrolet");
        c1.setModelo("Colorado");
        c1.setPlacas("DRC0704");
        System.out.println("Año: " + c1.getAño());
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Placas: " + c1.getPlacas());
        c1.calcularAdeudo();
        System.out.println("__________________________________________________"); 
        System.out.println("DATOS DEL CLIENTE: ");
        c1.setAño(2022);
        c1.setMarca("BMW");
        c1.setModelo("Z4");
        c1.setPlacas("DRR0704");
        System.out.println("Año: " + c1.getAño());
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Placas: " + c1.getPlacas());
        c1.calcularAdeudo();
    }  
}
