/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bloque01;

import java.util.Scanner;

/**
 *
 * @author yo
 */
public class SumarEntero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración de variables
        int numero1, numero2, suma;
        Scanner teclado = new Scanner(System.in);
        
        //Lectura de datos
        System.out.println("Introduce el primer número");
        numero1 = teclado.nextInt();
         System.out.println("Introduce el primer número");
        numero2 = teclado.nextInt();
        
        //Procesamiento de datos
        suma = numero1+numero2;
        
        //Salida de datos
        System.out.println("La suma es: " +suma);
        
    }
    
}
