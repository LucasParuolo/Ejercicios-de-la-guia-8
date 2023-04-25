/*
 * Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con 
 * los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) 
 * y cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar constructor vacío 
 * y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y 
    simula la acción de servir la taza con la capacidad indicada. 
    Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
    El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe 
   y se añade a la cafetera la cantidad de café indicada.

 */
package Servicios;

import Entidad.Cafeteria;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class CafeteriaServicios {
    Cafeteria caf1 = new Cafeteria();
    Scanner leer = new Scanner(System.in);
    
    public void llenarCafeteria(){
        System.out.println("Llenado la cafeteria");
        caf1.setCantidadActual(caf1.getCapacidadMaxima());
        System.out.println(caf1.getCantidadActual());
        System.out.println("");
    }
    
    public int servirTaza(){
        System.out.println("¿Cual es el tamaño de la taza?");
        int taza = leer.nextInt();
        
        if (caf1.getCantidadActual() <= taza){
            System.out.println("No alcanza");
            caf1.setCantidadActual(caf1.getCantidadActual()-caf1.getCantidadActual());
            System.out.println("Cantidad Actual = " + caf1.getCantidadActual());
        }else{
            caf1.setCantidadActual(caf1.getCantidadActual()-taza);
            System.out.println("Cantidad Actual = " + caf1.getCantidadActual());
        }
        
        System.out.println("");
        return caf1.getCantidadActual();
    }
    
    public int vaciarCafetera(){
        System.out.println("Se vacia la cafetera");
        caf1.setCantidadActual(0);
        System.out.println(caf1.getCantidadActual());
        System.out.println("");
        return caf1.getCantidadActual();
    }
    
    public int agregarCafe(){
        System.out.println("Introdusca una cantidad de cafe");
        int cafe = leer.nextInt();
        
        if (cafe > caf1.getCapacidadMaxima()){
            System.out.println("la cantidad que quiere agregar es mayor a la capacidad maxima, se va a desbordar");
            
        }else{
            caf1.setCantidadActual(caf1.getCantidadActual()+cafe);
        }
        System.out.println("Cantidad Actual = " + caf1.getCantidadActual());
        System.out.println("");
        return caf1.getCantidadActual();
    }
    
}
