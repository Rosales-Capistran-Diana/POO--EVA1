/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_mensaje;

/**
 *
 * @author 52614
 */
public class EVA1_9_Mensaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     nPrintLn( "Holaaa" , 6);   
    }
    public static void nPrintLn(String message, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
