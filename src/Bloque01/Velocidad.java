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
public class Velocidad {
     public static void main(String[] args){
        int kmPH;
        float metrosPS;  
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce los Km/h: ");
        kmPH = teclado.nextInt();
        metrosPS = kmPH*1000/3600f;
        
        System.out.println(kmPH +" km por hora son " +metrosPS +" metros por segundo");        
    }
}
