/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_static_2;

/**
 *
 * @author 52614
 */
public class EVA1_19_Static_2 {
int x = 100;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*mensajeNoEstatitco();
        En estos puntos ni mensajeNoEstatico ni x, existe
        System.out.println(x);*/
        
        EVA1_19_Static_2 obj = new EVA1_19_Static_2();
        System.out.println(obj.x);
        obj.mensajeNoEstatico();
        
        //Ahora los métodos estáticos.
        mensajeEstatico();
        
        //Lo estático solo existe una vez
    }
   public void mensajeNoEstatico(){ //No existe
       System.out.println("MENSAJE NO ESTÁTICO");
   } 
   public static void mensajeEstatico(){ //Existe al iniciar el programa
       System.out.println("MENSAJE ESTÁTICO");
   } 
}
