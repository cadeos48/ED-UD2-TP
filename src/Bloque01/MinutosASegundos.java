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
public class MinutosASegundos {
    public static void main(String[] args){
        int minutos, segundos;   
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce los minutos: ");
        minutos = teclado.nextInt();
        segundos = minutos*60;
        
        System.out.println(minutos +" minutos son " +segundos +" segundos");        
    }
}
