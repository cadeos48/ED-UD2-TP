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
public class ArrayVentas {
     public static void main(String [] args){
        float[] ArregloFl = new float[12];
        Scanner teclado = new Scanner(System.in);
        float ventaMensual;
        
        for (int cont = 0; cont<12; cont++){
          System.out.println("Introduzca venta mensual");
          ventaMensual = teclado.nextFloat();
          ArregloFl[cont]=ventaMensual;
        }
        
        System.out.print("Los números introducidos son: ");
        for (int cont = 0; cont<12; cont++){
            System.out.print(ArregloFl[cont] +"  ");
        }
    }
}
