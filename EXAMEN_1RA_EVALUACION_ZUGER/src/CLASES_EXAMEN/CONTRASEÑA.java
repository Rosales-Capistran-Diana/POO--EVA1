/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES_EXAMEN;

/**
 *
 * @author 52614
 */
public class CONTRASEÑA {
//ATRIBUTOS DE LA CLASE

    private static String Usuario;
    private static String Contraseña;

//CONSTRUCTOR SIN PARÁMETROS   
    public CONTRASEÑA() {
        Usuario = ("Zuger4");             //Valor por defecto de Usuario.
        Contraseña = ("22-52-05-10-70");  //Valor por defecto de Contraseña.

    }

    //CONSTRUCTOR CON PARÁMETROS
    public CONTRASEÑA(String U, String Pass) {
        Usuario = U;
        Contraseña = Pass;
    }

    // Métodos set para cambiar los valores de los atributos
    public void setUsuario(String valor) {      //set
        Usuario = valor;
    }

    public void setContraseña(String valor) {      //set
        Contraseña = valor;
    }

public void imprimirUsuarioContraseña(){
    System.out.println("Usuario: " + Usuario);
    System.out.println("Contraseña: " + Contraseña);
}
}

