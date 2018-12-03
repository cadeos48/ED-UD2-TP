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
public class Divison {
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración de variables
        float numero1, numero2, division;
        Scanner teclado = new Scanner(System.in);
        
        //Lectura de datos
        System.out.println("Introduce el dividendo");
        numero1 = teclado.nextInt();
        System.out.println("Introduce el divisor");
        numero2 = teclado.nextInt();
        
        //Procesamiento de datos
        division = numero1/numero2;
        
        //Salida de datos
        System.out.println("El cociente es: " +division);
    }
}
