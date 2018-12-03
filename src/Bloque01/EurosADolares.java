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
public class EurosADolares {
    public static void main(String[] args){
        float euros, dolares;
        float cotizacionDolar = 1.14f;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce cantidad en euros: ");
        euros = teclado.nextInt();
        dolares = euros*cotizacionDolar;
        
        System.out.println(euros +" euros son " +dolares +" dolares");        
    }
}