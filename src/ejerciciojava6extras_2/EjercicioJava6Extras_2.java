/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava6extras_2;

import Servicios.NIFservicios;

/**
 *
 * @author rober
 */
public class EjercicioJava6Extras_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFservicios ser1 = new NIFservicios();
        
        ser1.crearNif();
        ser1.mostrar();
        
    }
    
}
