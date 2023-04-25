/*
 * En NIFService se dispondrá de los siguientes métodos:
 * Métodos getters y setters para el número de DNI y la letra.
 * Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. 
   Una vez calculado, le asigna la letra que le corresponde según
 * Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).

 * La letra correspondiente al dígito verificador se calculará a traves de un método 
 * que funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir 
 * el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). 
 * El método debe buscar en un array (vector) de caracteres la posición que corresponda al 
 * resto de la división para obtener la letra correspondiente. 
 * La tabla de caracteres es la siguiente:

 */
package Servicios;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class NIFservicios {
    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
     char[] letra1 = letras.toCharArray();
    Scanner leer = new Scanner(System.in);
    NIF n1 = new NIF();
    
    public void crearNif(){
        System.out.println("Introdusca su DNI");
        n1.setDNI(leer.nextLong());
        
        
       
        
        n1.setLetra(this.calcularLetra());
    }
    
    private char calcularLetra(){
        int num = (int) (n1.getDNI() % 23);
        
        return letra1[num];
    }
    
    public void mostrar(){
        System.out.println(n1.toString());
    }
}
