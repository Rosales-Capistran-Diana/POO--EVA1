/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_constructores;

/**
 *
 * @author 52614
 */
public class EVA1_3_Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// Los constructores son métodos.
//Son el primer método en ejecutarse. Los métodos son todos los que tienen paréntesis().
//La utilidad principal del constructor es inicializar
       
        //CLASE IDENTIFICADOR =  new  CONSTRUCTOR()
        CuentaBancaria cuentaA = new CuentaBancaria("201", 122000 , "Carlos Slim");
        
        
        /*cuenta1.setNomCliente("Carlos Slim");
        cuenta1.setNumCuenta("201");
        cuenta1.setSaldo(122000);*/
        
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuentaA.getNomCliente());
        System.out.println(cuentaA.getNumCuenta());
        System.out.println(cuentaA.getSaldo());
        
        CuentaBancaria cuentaB = new CuentaBancaria();
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuentaB.getNomCliente());
        System.out.println(cuentaB.getNumCuenta());
        System.out.println(cuentaB.getSaldo());
        
        CuentaBancaria cuentaC = new CuentaBancaria("5203",500, "Diana");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuentaC.getNomCliente());
        System.out.println(cuentaC.getNumCuenta());
        System.out.println(cuentaC.getSaldo());
    }

}
