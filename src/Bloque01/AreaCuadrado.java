package Bloque01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author yo
 */
public class AreaCuadrado {
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración de variables
        float lado, area;
        Scanner teclado = new Scanner(System.in);
        
        //Lectura de datos
        System.out.println("Introduce la longitud del lado");
        lado = teclado.nextFloat();
               
        //Procesamiento de datos
        area = lado*lado;
        
        //Salida de datos
        System.out.println("El área del cuadrado es: " +area);
    }
}