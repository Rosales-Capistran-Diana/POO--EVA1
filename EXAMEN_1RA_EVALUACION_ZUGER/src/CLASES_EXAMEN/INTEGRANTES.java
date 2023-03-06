/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES_EXAMEN;

/**
 *
 * @author 52614
 */
public class INTEGRANTES {

    public static void ImprimirDatosEquipo(String mensaje) {
        System.out.println(mensaje);
    }

    public static void verificarAcceso() {
        CONTRASEÑA pass = new CONTRASEÑA();
        pass.imprimirUsuarioContraseña();
    }

    public static void A() {

        FichaBibliografica dato = new FichaBibliografica();

        dato.setNombre("The Shinning");
        dato.setAutor("Stephen King");
        dato.setEditorial("Doubleday");
        dato.setCiudad("Portland");
        dato.setAño(1997);
        dato.setPag(643);
        dato.imprimirDatos();
    }

    public static void TestCovid() {
        TestCovid pep = new TestCovid();
        pep.setEdad(18);
        pep.setEnf(true);
        pep.setEstatura(1.73);
        pep.setPeso(90);
        pep.EscribirDatos();
        pep.ProbarCovid();
        //TestCovid.ProblemaNivelMedio();

    }

    public static void ImprimirProblemasResueltos() {
        FIBONACCI fib = new FIBONACCI(6, 2, 5);  // Crea un objeto Fibonacci con n=6, a1=2 y a2=5
        fib.EscribirSucesion();
    }
public static void ImprimirDatosCuenta(){
            CuentaBancaria cb = new CuentaBancaria();
        cb.ImprimirDatos();
        
}
}
