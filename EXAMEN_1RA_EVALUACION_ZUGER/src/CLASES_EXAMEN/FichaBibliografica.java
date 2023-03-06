/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES_EXAMEN;

/**
 *
 * @author 52614
 */
public class FichaBibliografica {

    private String nombre;
    private String autor;
    private String editorial;
    private String ciudad;
    private int año;
    private int pag;

    public String getNombre() { //Get
        return nombre;
    }

    public String getAutor() { //Get
        return autor;
    }

    public String getEditorial() { //Get
        return editorial;
    }

    public int getAño() { //Get
        return año;
    }

    public int getPag() { //Get
        return pag;
    }

    public String getCiudad() { //Get
        return ciudad;
    }

    public void setNombre(String valor) { //Set
        nombre = valor;
    }

    public void setEditorial(String valor) { //Set
        editorial = valor;
    }

    public void setAutor(String valor) { //Set
        autor = valor;
    }

    public void setCiudad(String valor) {
        ciudad = valor;
    }

    public void setAño(int valor) { //Set
        año = valor;
    }

    public void setPag(int valor) { //Set
        pag = valor;
    }

    public void imprimirDatos() {
        System.out.println("Formato para citar: " + autor + ", " + nombre + ", del " + año);
        System.out.println(" con: " + pag + " paginas. Hecho en " + ciudad + ". Producido por " + editorial);
    }
}
