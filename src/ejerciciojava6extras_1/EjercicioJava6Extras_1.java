/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava6extras_1;

import Servicios.RaicesServicios;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class EjercicioJava6Extras_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesServicios ser = new RaicesServicios();
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los valores de A,B y C");
        ser.getDiscriminante(leer.nextDouble(), leer.nextDouble(), leer.nextDouble());
        
        ser.calcularRaiz();
        
    }
    
}
