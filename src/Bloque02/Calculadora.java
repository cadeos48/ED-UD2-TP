/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bloque02;

import java.util.Scanner;

/**
 *
 * @author yo
 */
public class Calculadora {
    Scanner teclado = new Scanner(System.in);
    public static void Menu(){
        int op;
        System.out.println ("1.Suma");
	System.out.println ("2.Resta");
	System.out.println ("3.Multiplicacion");
	System.out.println ("4.División");
	System.out.println ("5.Potencia");
	System.out.println ("6.Resto de división");
	System.out.println ("7.Salir");
	System.out.println ("Elige una opción");
        op = teclado.nextInt();
    }
}
