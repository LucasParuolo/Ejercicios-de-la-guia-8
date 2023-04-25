/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava6_3;

import Entidad.Persona;
import Servicios.ServiciosPersona;

/**
 *
 * @author rober
 */
public class Ejerciciojava6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
        
        ServiciosPersona p1 = new ServiciosPersona();
        //System.out.println("cantidad de personas a calcular");
        //int a = leer.nextInt();
        //boolean [] edad = new boolean [a];
        //int [] peso = new int [a];
        
        Persona per = new Persona(); 
        Persona per1 = new Persona();
        Persona per2 = new Persona();
        Persona per3 = new Persona();
        
        int[] resIMC = new int[4];
        boolean[] resadultez = new boolean [4];
        
        p1.crearPersona(per);
       resadultez[0] = p1.esMayorDeEdad(per);
       resIMC[0] = p1.calcularIMC(per);
        
        p1.crearPersona(per1);
        resadultez[1] = p1.esMayorDeEdad(per1);
        resIMC[1] = p1.calcularIMC(per1);
        
        p1.crearPersona(per2);
        resadultez[2] = p1.esMayorDeEdad(per2);
        resIMC[2] = p1.calcularIMC(per2);
        
        p1.crearPersona(per3);
        resadultez[3] = p1.esMayorDeEdad(per3);
        resIMC[3] = p1.calcularIMC(per3);
        
        int bajo = 0;
        int bien = 0;
        int alto = 0;
        int mayor = 0;
        int menor = 0;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Persona " + i+1);
            System.out.println(resIMC[i]);
            System.out.println(resadultez[i]);
            
            if(resadultez[i] == true){
                menor++;
                
            }else{
                mayor++;
            }
            
            if (resIMC[i] == -1) {
                System.out.println("bajo peso");
                
                
                bajo++;
            } else if (resIMC[i] == 0) {
                System.out.println("peso ideal");
                
            
                bien++;
            } else {
                System.out.println("tiene sobre peso");
                
               
                alto++;
            }
            
        }
        
        System.out.println("Mayores = " + mayor);
        System.out.println("Menores = " + menor);
        System.out.println("Peso bajo = " + bajo);
        System.out.println("Peso alto = " + alto);
        System.out.println("Peso normal = " + bien);
        
        
       /* edad [0] = p1.esMayorDeEdad(per);
        edad [1] = p1.esMayorDeEdad(per1);
        edad [2] = p1.esMayorDeEdad(per2);
        edad [3] = p1.esMayorDeEdad(per3);
        
        peso [0] = p1.calcularIMC(per);
        peso [1] = p1.calcularIMC(per1);
        peso [2] = p1.calcularIMC(per2);
        peso [3] = p1.calcularIMC(per3);*/
        
        
    }
    }


 
    

