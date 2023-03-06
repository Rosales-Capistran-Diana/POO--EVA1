/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES_EXAMEN;

/**
 *
 * @author 52614
 */
public class TestCovid {
    private double edad;
    private boolean enf;
    private double peso;
    private double estatura;
    private double imc;
    
    
   public void setEdad (double valor){
           edad = valor;
   }
    public double  getEdad(){
        return edad;
    }
    public void setEnf (boolean valor){
        enf = valor;
    }
    public boolean getEnf (){
        return enf;
    }
    public void setPeso (double valor){
        peso = valor;   
    }
    public double getPeso(){
        return peso ;  
    }
    public void setEstatura(double valor){
        estatura = valor;
    }
    public double getEstatura (){
        return estatura;
    }
    public void EscribirDatos (){
        System.out.println("la edad de la persona es: "+edad);
        System.out.println(" ¿tiene alguna enfermedad cronica?  "+enf);
        System.out.println("el peso de la persona es: "+peso+"kg");
        System.out.println("la estatura de la persona es: "+ estatura+"m");
        
            
        }
    public void ProbarCovid(){
        imc = peso/(estatura*estatura);
        System.out.println("el imc(indice de masa corporal es: )"+ imc);
        if (edad <65 && enf == false && imc <  30) {
            System.out.println("no sera muy grave si enfermas de covid");
        }
        else {
            System.out.println("CUIDATE DEL COVID, PUEDE SER GRAVE SI TE ENFERMAS");
        }
}
}
