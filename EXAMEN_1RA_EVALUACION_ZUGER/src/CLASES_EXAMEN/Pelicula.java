/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES_EXAMEN;

/**
 *
 * @author 52614
 */
public class Pelicula {

    private String titulo;
    private String estudio;
    private String rating;

    public Pelicula() {
        titulo = "creed3";
        estudio = "MGM";
        rating = "mayor";

    }

    public void imprimirdatos() {
        System.out.println("titulo:" + titulo);
        System.out.println("estudio:" + estudio);
        System.out.println("rating:" + rating);
    }

    public String gettitulo() {
        return titulo;
    }

    public String getestudio() {
        return estudio;
    }

    public String getrating() {
        return rating;
    }

    public void setnotitulo(String titul) {
        this.titulo = titul;
    }

    public void setestudio(String estud) {
        this.estudio = estud;
    }

    public void setrating(String rat) {
        this.rating = rat;
    }

    public void evaluaredad(double edad) {
        if (edad >= 17) {
            System.out.println("puedes ver la pelicula");
        } else {
            System.out.println("No la puedes ver");
        }
    }
}
