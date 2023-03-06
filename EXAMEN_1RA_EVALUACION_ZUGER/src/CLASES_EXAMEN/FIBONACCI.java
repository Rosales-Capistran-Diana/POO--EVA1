/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES_EXAMEN;

/**
 *
 * @author 52614
 */
public class FIBONACCI {
        // Atributos de la clase
    private int n;   // cantidad de números en la serie a generar
    private int a1;  // primer número de la serie
    private int a2;  // segundo número de la serie
    
    // Constructor sin parámetros
    public FIBONACCI() {
        this.n = 6;  // valor por defecto de n
        this.a1 = 1; // valor por defecto de a1
        this.a2 = 1; // valor por defecto de a2
    }
    
    // Constructor con parámetros
    public FIBONACCI(int n, int a1, int a2) {
        this.n = n;
        this.a1 = a1;
        this.a2 = a2;
    }
    
    // Métodos set para cambiar los valores de los atributos
    public void setN(int n) {
        this.n = n;
    }
    
    public void setA1(int a1) {
        this.a1 = a1;
    }
    
    public void setA2(int a2) {
        this.a2 = a2;
    }
    
    // Métodos get para obtener los valores de los atributos
    public int getN() {
        return this.n;
    }
    
    public int getA1() {
        return this.a1;
    }
    
    public int getA2() {
        return this.a2;
    }
    
    // Método para calcular la serie de Fibonacci
    public int[] calculateSeries() {
        int[] series = new int[this.n];  // Array para almacenar la serie de Fibonacci
        series[0] = this.a1;  // El primer número de la serie es a1
        series[1] = this.a2;  // El segundo número de la serie es a2
        for (int i = 2; i < this.n; i++) {
            // Los siguientes números de la serie se calculan sumando los dos anteriores
            series[i] = series[i-1] + series[i-2];
        }
        return series;  // Devuelve la serie de Fibonacci generada
    }
    
    // Método para imprimir la serie de Fibonacci
    public void EscribirSucesion() {
        int[] series = this.calculateSeries();  // Genera la serie de Fibonacci
        for (int num : series) {
            System.out.print(num + " ");  // Imprime cada número de la serie
        }
        System.out.println();  // Agrega un salto de línea al final
    }
}
 