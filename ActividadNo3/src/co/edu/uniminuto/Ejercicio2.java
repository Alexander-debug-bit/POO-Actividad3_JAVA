/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto;


/**
 *
 * @author andresalexanderrativapineda
 */

import java.util.Scanner;

public class Ejercicio2 {
  
/*2.Hacer un programa en Java que cuente y sume los múltiplos de 5 y 3 
(para ser sumado debe verificarse que sea múltiplo de 5 y 3 a la vez) 
comprendidos entre 1y n (n es determinado por el usuario). 
Imprimir la cantidad de múltiplos de 5 y 3.*/
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo (n): ");
        int n = scanner.nextInt();
        scanner.close();

        int sumaMultiplos = 0;
        int cantidadMultiplos = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sumaMultiplos += i;
                cantidadMultiplos++;
            }
        }

        System.out.println("La suma de los múltiplos de 5 y 3 entre 1 y " + n + " es: " + sumaMultiplos);
        System.out.println("La cantidad de múltiplos de 5 y 3 es: " + cantidadMultiplos);
    }
}
