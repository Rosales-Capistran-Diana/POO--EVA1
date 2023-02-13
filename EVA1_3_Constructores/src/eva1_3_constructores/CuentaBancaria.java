/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_3_constructores;

/**
 *
 * @author 52614
 */
public class CuentaBancaria {
//Por regla los constructores van después de los atributos.
    
    private double saldo;
    private String numCuenta;
    private String nomCliente;
    
    /* Constructores:
    * Modificador de acceso, nombre de la clase (argumentos)
    * Son públicos.
    * El método debe de llamarse exactamente igual que la clase.
    */
    
    public CuentaBancaria(){ //CONSTRUCTOR DEFAULT (ya que no tiene nada entre paréntesis)
        numCuenta = "0000-0000-0000-0000";
        nomCliente = "No registrado.";
        saldo = 0;  
    }
    public CuentaBancaria(String nCuenta, double dinero, String nCliente){ //CONSTRUCTOR
        numCuenta = nCuenta;
        saldo = dinero;
        nomCliente = nCliente;
    }

    //Métodos get y set
    public String getNomCliente() {                 //get
        return nomCliente;
    }

    public void setNomCliente(String valor) {      //set
        nomCliente = valor;
    }

    public String getNumCuenta() {             //get
        return numCuenta;
    }

    public void setNumCuenta(String valor) {   //set
        numCuenta = valor;
    }

    public double getSaldo() {      //get
        return saldo;
    }

    public void setSaldo(double valor) {   //set
        saldo = valor;
    }
}
