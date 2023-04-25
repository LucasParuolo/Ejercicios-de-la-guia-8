/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava6_2;

import Entidad.Cafeteria;
import Servicios.CafeteriaServicios;

/**
 *
 * @author rober
 */
public class EjercicioJava6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteriaServicios cafs1 = new CafeteriaServicios();
        Cafeteria caf1 = new Cafeteria();
        
        cafs1.llenarCafeteria();
        cafs1.servirTaza();
        cafs1.vaciarCafetera();
        cafs1.agregarCafe();
    }
    
}
