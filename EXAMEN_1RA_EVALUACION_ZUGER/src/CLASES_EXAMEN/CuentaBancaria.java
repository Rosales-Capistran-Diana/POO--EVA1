/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES_EXAMEN;

/**
 *
 * @author 52614
 */
public class CuentaBancaria {

    private String numCuenta;
    private String nomCliente;
    private int saldo;

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String valor) {
        numCuenta = valor;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String valor) {
        nomCliente = valor;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int valor) {
        saldo = valor;
    }

    public CuentaBancaria() {
        numCuenta = "";
        nomCliente = "";
        saldo = 0;
    }

    public CuentaBancaria(String cuenta, String cliente, int dinero) {
        numCuenta = cuenta;
        nomCliente = cliente;
        saldo = dinero;
    }
// deposita una cantidad dada en la cuenta bancaria, si la cantidad es positiva
    public void depositarEnCuenta(int cantidad) {
        if (cantidad >= 0) {
            saldo += cantidad;
            System.out.println("Ahora tiene: $" + saldo + " en su cuenta.");
        }
    }
 // retira una cantidad dada de la cuenta bancaria, si hay suficiente saldo
    public void retirarDeCuenta(int cantidad) {
        if (cantidad >= 0 && saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
// imprime los datos de la cuenta bancaria (nombre del cliente, número de cuenta y saldo)
    public void ImprimirDatos() {
        System.out.println("Nombre del cliente: " + nomCliente);
        System.out.println("Numero de cuenta: " + numCuenta);
        System.out.println("Saldo: $" + saldo);
    }
}
