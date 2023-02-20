/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_6_automovil;

/**
 *
 * @author 52614
 */
public class Carro {

    private String modelo;
    private String placas;
    private int año;
    private String marca;
    private int adeudo;

    public Carro() { //CONSTRUCTOR DEFAULT
        modelo = "No registrado";
        placas = "___ - __ - __";
        año = ' ';
        marca = "_____________";
        adeudo = 0;
    }

    public Carro(String mod, String marc, String p, int a, int ad) { //CONSTRUCTOR
        modelo = mod;
        marca = marc;
        placas = p;
        año = a;
        adeudo = ad;
    }

    //Métodos get y set
    public String getModelo() {                 //get
        return modelo;
    }

    public void setModelo(String d) {      //set
        modelo = d;
    }

    public String getMarca() {                 //get
        return marca;
    }

    public void setMarca(String d) {      //set
        marca = d;
    }

    public String getPlacas() {                 //get
        return placas;
    }

    public void setPlacas(String d) {      //set
        placas = d;
    }

    public int getAño() {      //get
        return año;
    }

    public void setAño(int d) {   //set
        año = d;
    }

    public int getAdeudo() {      //get
        return adeudo;
    }

    public void setAdeudo(int d) {   //set
        adeudo = d;
    }

    //La regla para el nombre de los métodos debe ser un verbo.
    public void calcularAdeudo() {
        if (año <= 2000) {
            adeudo = 0;
            adeudo = adeudo + 1500;
        } else if (año > 2000 && año < 2006) {
            adeudo = 0;
            adeudo = adeudo + 2000;
        } else if (año > 2006 && año < 2011) {
            adeudo = 0;
            adeudo = adeudo + 2500;
        } else if (año > 2011 && año < 2016) {
            adeudo = 0;
            adeudo = adeudo + 3000;
        } else if (año > 2016 && año < 2024) {
            adeudo = 0;
            adeudo = adeudo + 4000;
        }
        System.out.println("Adeudo: " + adeudo);
    }
}
