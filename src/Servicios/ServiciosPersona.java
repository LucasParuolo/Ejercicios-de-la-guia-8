/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class ServiciosPersona {
         Scanner leer = new Scanner(System.in);

    public void crearPersona(Persona p1) {

        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.nextLine());
        
        System.out.println("Ingrese su edad");
        p1.setEdad(leer.nextInt());
        leer.nextLine();

        do {
            System.out.println("coloque el sexo");
            p1.setSexo(leer.nextLine());
            if ((!"H".equals(p1.getSexo().toUpperCase())) && (!"M".equals(p1.getSexo().toUpperCase())) && (!"O".equals(p1.getSexo().toUpperCase()))) {
                System.out.println("La opcion no es valida");
            }

        } while ((!"H".equals(p1.getSexo().toUpperCase())) && (!"M".equals(p1.getSexo().toUpperCase())) && (!"O".equals(p1.getSexo().toUpperCase())));

        System.out.println("Indique su altura");
        p1.setAltura(leer.nextDouble());
        System.out.println("Indique su peso");
        p1.setPeso(leer.nextDouble());
        leer.nextLine();
    }

    public boolean esMayorDeEdad(Persona p1) {
        boolean x = false;
        

            if (p1.getEdad() < 18) {
                System.out.println("Es menor de edad");
                x = true;
            } else {
                System.out.println("Es mayor de edad");
                x = false;
            }
        return x;
    }

    public int calcularIMC(Persona p1) {//peso en kg/(altura^2 en mt2
        double imc = p1.getPeso() / (p1.getAltura() * p1.getAltura());
        
        int x = 0;
        

            if (imc < 20) {
                System.out.println("bajo peso");
                x = -1;
                System.out.println(x);
            }
            else if (imc <= 25){
                System.out.println("peso ideal");
                x = 0;
                System.out.println(x);
                
            } else {
                System.out.println("tiene sobre peso");
                x = 1;
                System.out.println(x);
            }
            

        

        return x;
    }
}
    



/*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
Si esta fórmula da por resultado un valor menor que 20, significa que la persona 
está por debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0.
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso,
y la función devuelve un 1.*/
