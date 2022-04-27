/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dathos;

/**
 *
 * @author DIEGO VARGAS1
 */
public class Dathos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Informacion info = new Informacion("Diego", "ISC", 2);
        System.out.println("\n" + "-----------BIENVENIDO--------------");

        String NumCon = info.getNombre() + " " + info.getCarrera() + " " + info.getSemestre();
        System.out.println("\nDatos Generales alumno(a): " + NumCon);
        System.out.println("Hola");
    }
//se crean metodos
}

