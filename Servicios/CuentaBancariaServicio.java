/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class CuentaBancariaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria solicitarDatos(){
        CuentaBancaria ban1 = new CuentaBancaria();
        System.out.println("CARGA LOS DATOS");
        System.out.println("Ingrese su numero de cuenta");
        ban1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        ban1.setDniCliente((int) leer.nextLong());
        ban1.setSaldoActual(0);
        
        return ban1;
    }
    
    public double ingresar(CuentaBancaria ban1){
        System.out.println("¿Cuanto dinero desea ingresar?");
        ban1.setSaldoActual(ban1.getSaldoActual() + leer.nextDouble());
        return ban1.getSaldoActual();
    }
    
    public double retirar(double retiro, CuentaBancaria ban1){//double viene en los parametros
      
      if (retiro<=ban1.getSaldoActual()){
      
      ban1.setSaldoActual(ban1.getSaldoActual()-retiro);
              
      }
      else{
          System.out.println("FONDOS INSUFICIENTES");}
      return ban1.getSaldoActual();

  }
    
    public double retirar(CuentaBancaria ban1){//double viene en los parametros
        System.out.println("¿Cuanto desea retirar?");
        double retiro = leer.nextDouble();
      if (retiro<=ban1.getSaldoActual()){
      
      ban1.setSaldoActual(ban1.getSaldoActual()-retiro);
              
      }
      else{
          System.out.println("FONDOS INSUFICIENTES");}
      return ban1.getSaldoActual();

  }
  
  
  
 /*Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.*/
 public double extraccionRapida(CuentaBancaria ban1){
  
      System.out.println("EXTRACCION RAPIDA");
      System.out.println("indique monto a RETIRAR");
      double retiro= leer.nextDouble();
      
      if (retiro<=ban1.getSaldoActual()*0.2){
      
     retirar(retiro,ban1);
              
      }
      else {System.out.println("NO PUEDE RETIRAR MAS DEL 20%");}
      return ban1.getSaldoActual();
      
  }
 
 public void consultarSaldo(CuentaBancaria ban1){
     System.out.println("Saldo Actual= " + ban1.getSaldoActual());
 }
 
 public void consultarDatos(CuentaBancaria ban1){
     System.out.println(ban1.toString());
 }
}
