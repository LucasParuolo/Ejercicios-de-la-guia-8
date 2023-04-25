/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava6_1;

import Entidad.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class EjercicioJava6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio ser = new CuentaBancariaServicio();
        //CuentaBancaria cb = new CuentaBancaria();
        CuentaBancaria cb = ser.solicitarDatos();
    
        
        System.out.println("");
        ser.ingresar(cb);
        System.out.println("");
        ser.retirar(cb);
        System.out.println("");
        ser.consultarSaldo(cb);
        System.out.println("");
        ser.extraccionRapida(cb);
        System.out.println("");
        ser.consultarSaldo(cb);
        System.out.println("");
        ser.consultarDatos(cb);
    }
    
}
