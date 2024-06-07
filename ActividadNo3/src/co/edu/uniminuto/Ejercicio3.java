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

public class Ejercicio3 {

/**3.Hacer un programa en Java que, dado un rango, por el usuario, se da número
inicial y uno final (tomar en cuenta que el inicial debe ser menor que el final,
hacer la validación y volver a pedir los dos números si no cumple la condición) 
y sume los números pares dentro del rango incluyendo el valor inicial y final.
*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los números inicial y final
        System.out.print("Ingrese el número inicial: ");
        int numeroInicial = scanner.nextInt();

        System.out.print("Ingrese el número final: ");
        int numeroFinal = scanner.nextInt();

        // Validar que el número inicial sea menor que el número final
        while (numeroInicial >= numeroFinal) {
            System.out.println("El número inicial debe ser menor que el número final.");
            System.out.print("Ingrese el número inicial nuevamente: ");
            numeroInicial = scanner.nextInt();
        }

        // Calcular la suma de los números pares dentro del rango
        int sumaPares = 0;
        for (int i = numeroInicial; i <= numeroFinal; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }

        // Mostrar el resultado
        System.out.println("La suma de los números pares es: " + sumaPares);
    }
}
