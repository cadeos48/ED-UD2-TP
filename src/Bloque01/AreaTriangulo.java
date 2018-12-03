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
public class AreaTriangulo {
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración de variables
        float base, altura, area;
        Scanner teclado = new Scanner(System.in);
        
        //Lectura de datos
        System.out.println("Introduce la base");
        base = teclado.nextFloat();
        System.out.println("Introduce la altura");
        altura = teclado.nextFloat();
        
        //Procesamiento de datos
        area = base*altura/2;
        
        //Salida de datos
        System.out.println("El area del triangulo es: " +area);
    }
}
