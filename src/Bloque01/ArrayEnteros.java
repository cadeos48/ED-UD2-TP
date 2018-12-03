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
public class ArrayEnteros {
    public static void main(String [] args){
        int[] ArregloEnt = new int[6];
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        for (int cont = 0; cont<6; cont++){
          System.out.println("Introduzca un número");
          numero = teclado.nextInt();
          ArregloEnt[cont]=numero;
        }
        
        System.out.print("Los números introducidos son: ");
        for (int cont = 0; cont<6; cont++){
            System.out.print(ArregloEnt[cont] +" ");
        }
    }
}