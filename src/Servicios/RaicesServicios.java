/*
Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c

Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
para que esto ocurra, el discriminante debe ser mayor o igual que 0.

Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
para que esto ocurra, el discriminante debe ser igual que 0.

Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.

Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.

Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), 
y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con 
los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y
en caso de no existir solución, se mostrará un mensaje.

 */
package Servicios;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class RaicesServicios {
    
    Raices ra = new Raices();
    Scanner leer = new Scanner(System.in);
    
    
    public double getDiscriminante(double A, double B, double C){
        ra.setA(A);
        ra.setB(B);
        ra.setC(C);
        double dis = ((ra.getB() * ra.getB())-4*ra.getA()*ra.getC());
        
        return dis;
    }
    
//    public double getDiscriminante(){
//        //va a volver a ejecutar el metodo y por ende volvera a preguntar los valores una y otra y otra y otra y otra y otra vez
//        System.out.println("Ingrese los valores de A, B y C");
//        ra.setA(leer.nextDouble());
//        ra.setB(leer.nextDouble());
//        ra.setC(leer.nextDouble());
//        double dis = ((ra.getB() * ra.getB())-4*ra.getA()*ra.getC());
//        
//        return dis;
//    }
    
    private boolean tieneRaices(){
       
        if (this.getDiscriminante(ra.getA(),ra.getB(),ra.getC()) > 0){
            
            System.out.println("Tiene dos soluciones");
            return true;
        }else{
            System.out.println("No tiene dos soluciones");
        }
        return false;
    }
    
    private boolean tieneRaiz(){
      
        if (this.getDiscriminante(ra.getA(),ra.getB(),ra.getC()) == 0){
            System.out.println("Tiene una solucion");
            return true;
        }else{
            System.out.println("No tiene una solucion");
            
        }
        return false;
    }
    
    private void obtenerRaices(){
        if (this.tieneRaices()/*== true*/){
            System.out.println("solucion1 = "+ (-(ra.getB())+Math.sqrt(this.getDiscriminante(ra.getA(),ra.getB(),ra.getC())))/(2*ra.getA()) );
            System.out.println("solucion2 = "+ (-(ra.getB())-Math.sqrt(this.getDiscriminante(ra.getA(),ra.getB(),ra.getC())))/(2*ra.getA()) );
        }
    }
    // (-b±     √((b^2)-(4*a*c)))/(2*a)
    private void obtenerRaiz(){
        if (this.tieneRaiz()){
            System.out.println("solucion = "+ (-(ra.getB())+Math.sqrt(this.getDiscriminante(ra.getA(),ra.getB(),ra.getC())))/(2*ra.getA()) );
        }
    }
    
    public void calcularRaiz(){
        if (this.tieneRaices()){
            this.obtenerRaices();
        } else if (this.tieneRaiz()){
            this.obtenerRaiz();
        } else{
            System.out.println("no tiene solucion");
        }
        
    }
    
}
