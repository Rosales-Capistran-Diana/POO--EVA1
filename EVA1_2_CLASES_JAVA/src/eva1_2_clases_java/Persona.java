/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_2_clases_java;

/**
 *
 * @author 52614
 */
public class Persona {
    //Datos --> Atributos de la clase.

    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    //Métodos --> Comportamiento de la clase.
    //Leer y escribir los atributos de la clase.
    //Leer --> GET 
    //Escribir --> SET 
    //Modificador de acceso, valor de retorno, nombre del método (argumentos){implementación}

    //Los métodos comienzan en minúsculas.
    public String getNombre() {      //get
        return nombre;
    }

    public void setNombre(String valor) {   //set
        nombre = valor;
    }

    public String getApellidos() {      //get
        return apellidos;
    }

    public void setApellidos(String valor) {   //set
        apellidos = valor;
    }

    public int getEdad() {      //get
        return edad;
    }

    public void setEdad(int valor) {   //set
        edad = valor;
    }

    public char getGenero() {      //get
        return genero;
    }

    public void setGenero(char valor) {   //set
        genero = valor;
    }

    public void ImprimirDatos() { //Paréntesis vacíos es porque se enviará un dato
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad);
        //System.out.println("Genero: " + genero);
        if (genero == 'H') {
            System.out.println("Hombre");
        } else if (genero == 'M') {
            System.out.println("Mujer");
        } else if (genero == 'L') {
            System.out.println("Lesbiana");
        } else {
            System.out.println("Genero no especificado");
        }
    }
}
